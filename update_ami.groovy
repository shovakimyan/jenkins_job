#!groovy

pipeline {
    agent any
	
    environment {
        AWS_DEFAULT_REGION  = "True"
    }
	
    parameters {

        booleanParam(name: 'TOGGLE', defaultValue: false, description: 'Toggle this value')

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
     		when { expression { return params.TOGGLE } }
     		steps {
        	sh 'echo "running the stage"'
   	 	}
	}	    
	    
	
    	}
    }

