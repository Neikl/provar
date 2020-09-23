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

                sh " sudo ant -f ANT/build.xml runtests"

            }

        }

    }   

}
