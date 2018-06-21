pipeline {
    agent { docker {
    image 'maven:3.3.3'
    customWorkspace '/tmp/'
  } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
