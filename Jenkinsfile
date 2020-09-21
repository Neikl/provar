pipeline {

    agent any

    stages {
    
        stage('Git Clone') {

            steps {

                git 'https://github.com/Neikl/provar.git'

            }

        }

        stage('Run Provar Tests') {

            steps {

                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"       

                sh "sudo xvfb-run ant -f ANT/build.xml -v"

            }

        }

    }

    post {

        always {

            junit allowEmptyResults: true, testResults: 'ANT/Results/*.xml'

            cleanWs notFailBuild: true /* cleans up the workspace */

        }

        success {

            echo "Success: Good job!"

        }        

        failure {            

            echo 'Failure: Something went wrong with the Provar ANT build. Printing environment for debugging'            

            sh 'sudo printenv'

            echo 'Printing hosts'

            sh 'sudo cat /etc/hosts'

            echo 'Searching for provar directories/files in the system...'

            sh 'sudo find / -name "provar*"'

            echo 'Finding chrome drivers'

            sh "sudo find / -name '*chromedriver*'"

        }        

    }   

}
