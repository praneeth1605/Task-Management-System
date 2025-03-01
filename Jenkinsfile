pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/praneeth1605/Task-Management-System.git', 
                    branch: 'main', 
                    credentialsId: 'aa06d090-c4c4-4c4b-8e6d-ae52b45ed120'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
