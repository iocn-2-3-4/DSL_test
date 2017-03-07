job('Seeds_test') {
  scm {
    git ('https://github.com/iocn-2-3-4/git_1.git')
  }
  steps {
    pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('Misc') {
            steps {
                echo 'None'
            }
        }
    }
}

  }
}
