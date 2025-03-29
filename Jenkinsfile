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
                    credentialsId: 'github-praneeth'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                pkill -f 'java -jar' || true
                mkdir -p /home/ubuntu/app
                cp target/task-management-system-0.0.1-SNAPSHOT.jar /home/ubuntu/app/
                nohup java -jar /home/ubuntu/app/task-management-system-0.0.1-SNAPSHOT.jar &
                '''
            }
        }
    }
}
