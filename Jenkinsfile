pipeline {
    agent any
    tools {
        maven 'Maven3'  // Make sure Maven3 tool is installed in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/praneeth1605/Task-Management-System.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install'  // Ensure that Maven build runs correctly
                }
            }
        }
    }
    post {
        always {
            echo 'Cleaning up after build...'
        }
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
