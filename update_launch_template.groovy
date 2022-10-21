#!groovy

pipeline {
    agent {
        label "infra"
    }
    options {
        timeout(time: 40, unit: "MINUTES")
    }
    environment {
        AWS_DEFAULT_REGION = "us-east-1"
    }
    stages {

        stage ("Prepare Infrastructure") {
            environment {
                PROCESSING_SSH_KEY = credentials("ssh-key-processing-machine")
                PROCESSING_SSH_KEY_PATH = "/tmp/processing-key.pem"
            }
            steps {
                    script {
                        sh """#!/bin/bash
                            pip3 install -r requirements.txt
                            echo ${params.pipeline_type}
                        """
                    }
                }
            }
        }
    }
}
