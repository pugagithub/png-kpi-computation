pipeline {
    agent { docker {
    image 'centos'
  } }
    stages {
        stage('build') {
            steps {
                sudo sh 'echo "Hello World"'
            }
        }
    }
}
