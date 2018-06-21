pipeline {
    agent { docker {
    image 'maven:3.3.3'
    args  '-v /tmp/:/tmp/'
     } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
