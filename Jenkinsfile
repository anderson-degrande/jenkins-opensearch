pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clonar o repositório do GitHub
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                // Suas etapas de construção aqui
            }
        }

        stage('Deploy') {
            steps {
                // Suas etapas de implantação aqui
            }
        }
    }

    post {
        always {
            // Qualquer coisa que você queira fazer sempre após a conclusão da pipeline
        }
    }
}
