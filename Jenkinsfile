pipeline {

    agent any

    stages {
    
        stage('Run Provar Tests') {

            steps {

                git 'https://github.com/Neikl/provar.git'

            }

        }

        stage('Run Provar Tests') {

            steps {

                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"       

                sh "xvfb-run ant -f ANT/build.xml -v"

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

            sh 'printenv'

            echo 'Printing hosts'

            sh 'cat /etc/hosts'

            echo 'Searching for provar directories/files in the system...'

            sh 'find / -name "provar*"'

            echo 'Finding chrome drivers'

            sh "find / -name '*chromedriver*'"

        }        

    }   

}
