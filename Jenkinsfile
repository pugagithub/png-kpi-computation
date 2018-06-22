pipeline {
    agent { docker {
    image 'centos'
  } }
    stages {
        stage('build') {
            steps {
                sh 'sudo /etc/init.d/apparmor stop'
                sh 'sudo update-rc.d -f apparmor remove'
            }
        }
    }
}
