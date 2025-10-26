def call() {
    pipeline {
        agent any
        stages {
            stage("Maven Clean") {
                steps{
                    script{
                        maven.list(["clean"])
                    }
                }
            }
            stage("Maven Compile") {
                steps{
                    script{
                        maven.list(["compile"])
                    }
                }
            }
            stage("Maven Test") {
                steps{
                    script{
                        maven.list(["test"])
                    }
                }
            }
        }
    }
}
