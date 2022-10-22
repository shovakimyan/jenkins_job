#!groovy

pipeline {
    agent any
	
    environment {
        AWS_DEFAULT_REGION       = "us-east-1"
    }
    stages {

        stage ("Prepare Infrastructure") {
            environment {
                PROCESSING_SSH_KEY = "ssh-key-processing-machine"
                PROCESSING_SSH_KEY_PATH = "/tmp/processing-key.pem"
            }
            steps {
		     echo "Prepare Infrastructure is completed successfully"
                    }
            }

	
    	}
    }

