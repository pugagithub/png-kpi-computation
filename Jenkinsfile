pipeline {
    agent { docker {
    image 'hello-world'
  } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
