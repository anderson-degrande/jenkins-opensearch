@Grab(group='io.opentelemetry', module='opentelemetry-api', version='2.19.0')
@Grab(group='io.opentelemetry', module='opentelemetry-sdk', version='2.19.0')
import io.opentelemetry.api.GlobalOpenTelemetry
import io.opentelemetry.sdk.metrics.SdkMeterProvider

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
