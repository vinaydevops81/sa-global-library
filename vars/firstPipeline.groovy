import com.i27academy.builds.Calculator

def call(Map pipelineParams) {
    Calculator calculator = new Calculator(this)
    environment {
        APP_NAME = "${pipelineParams.appName}"
    }
    pipeline {
        agent any
        stages {
            stage("Echol") {
                steps {
                script {
                    echo "printing sum of 2 numbers"
                    println calculator.add(2,8)
                      echo "printing multiply of 2 numbers"
                    println calculator.multiply(2,8)
                    echo "microservice name is ${APP_NAME}"
                }
                }
            }
        }
    }
}


