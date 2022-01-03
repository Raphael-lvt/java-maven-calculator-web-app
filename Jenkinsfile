pipeline {

	agent any
	
	parameters {
	string(name: 'tomcat_dev', defaultValue:'C:/Installation/apache-tomcat-8.5.73/webapps', description:'Staging Server : 8080')
	string(name: 'tomcat_prod', defaultValue:'C:/Installation/apache-tomcat-8.5.73 - production/webapps', description:'Production Server : 8090')
	}
	
	triggers{
	pollSCM('* * * * *') //Polling Source Control
	}
	
	stages{
		stage('Build') {
			steps{
			bat 'mvn clean package'
			}
			post {
				success {
				echo "Now Archiving ...."
				archiveArtifacts artifacts: '**/target/*.war'
				}
			}
		}
		
		stage('Deployments'){
			parallel {
				stage ('Deploy to Staging') {
					steps {
					deploy adapters: [tomcat8(credentialsId: '2b00276c-76c4-4ec1-a307-6743bf21871a', path: '', url: 'http://localhost:8080')], contextPath: null, war: '**/*.war'
					}
				}
				
				stage('Deploy to Production') {
					steps {
					deploy adapters: [tomcat8(credentialsId: '2b00276c-76c4-4ec1-a307-6743bf21871a', path: '', url: 'http://localhost:8090')], contextPath: null, war: '**/*.war'
					}
				}
			}
		}
	}
}
