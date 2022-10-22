#!groovy

pipeline {
    agent any
	
    environment {
        AWS_DEFAULT_REGION  = "True"
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

	    
	stage('test cond') {
     		when { expression { return env.AWS_DEFAULT_REGION } }
     		steps {
        	sh 'echo "running the stage"'
   	 	}
	}	    
	    
	
    	}
    }

