pipeline {
    agent { docker {
    image 'centos'
  } }
    stages {
        stage('build') {
            steps {
                 sh 'sudo echo "Hello World"'
            }
        }
    }
}
