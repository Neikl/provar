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
                sh "java -version"
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                //sh "xvfb-run ant -f ANT/build.xml -v"
                sh "ant -f ANT/build.xml runtests"
            }

        }

    }   

}
