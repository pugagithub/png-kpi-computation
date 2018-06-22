pipeline {
    agent { docker {
    image 'maven:latest'
  } }
    stages {
        stage('build') {
            steps {
                sh 'echo "Hello World"'
            }
        }
    }
}
