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
                sh "pwd"
                sh "xvfb-run ant –f /var/lib/jenkins/workspace/provar-testing/ANT/build.xml"

            }

        }

    }   

}
