pipeline {
    agent { docker {
    image 'maven:3.3.3'
    args '-u root:root'
     } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
