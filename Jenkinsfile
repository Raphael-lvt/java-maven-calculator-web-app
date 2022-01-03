pipeline {

	agent any
	
	parameters {
	string(name: 'tomcat_dev', defaultValue:'C:/Installation/apache-tomcat-8.5.73/calculator', description:'Staging Server : 8080')
	string(name: 'tomcat_prod', defaultValue:'C:/Installation/apache-tomcat-8.5.73 - production/calculator', description:'Production Server : 8090')
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
					bat "cp **/target/*.war %tomcat_dev%"
					}
				}
				
				stage('Deploy to Production') {
					steps {
					bat "cp **/target/*.war %tomcat_prod%"
					}
				}
			}
		}
	}
}
