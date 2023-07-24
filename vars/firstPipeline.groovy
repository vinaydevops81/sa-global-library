import com.i27academy.builds.Calculator


pipeline {
    agent any
    stages {
        stage("Echol") {
            steps {
               script {
                 echo "printing sum of 2 numbers"
                 println Calculator.add(2,8)
               }
            }
        }
    }
}