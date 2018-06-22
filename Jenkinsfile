pipeline {
    agent { docker {
    image 'centos'
  } }
    stages {
        stage('build') {
            steps {
                sh 'echo "Hello World"'
            }
        }
    }
}
