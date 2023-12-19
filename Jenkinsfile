@Library('cicd') _
import src.MyOpenTelemetry

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
                echo 'Construindo...'
                script {
                    def startTime = System.currentTimeMillis()
                    // Suas etapas de construção aqui
                    def endTime = System.currentTimeMillis()
                    
                    // Registre a métrica de duração
                    MyOpenTelemetry.configureOpenTelemetry()
                    GlobalOpenTelemetry.get().getMeterProvider().get("pipeline").longValueRecorderBuilder("build_duration").build().record(endTime - startTime)
                }
            }
        }

        stage('Deploy') {
            steps {
                // Suas etapas de implantação aqui
                echo 'Implantando...'
            }
        }
    }

    post {
        always {
            // Qualquer coisa que você queira fazer sempre após a conclusão da pipeline
            echo 'Sempre faça isso...'
        }
    }
}
