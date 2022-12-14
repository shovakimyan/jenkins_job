pipeline {
    agent any
	
	
    parameters {
	    



        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')

    }
	
    stages {

        stage ("Prepare Infrastructure") {
            environment {
                PROCESSING_SSH_KEY = "ssh-key-processing-machine"
                PROCESSING_SSH_KEY_PATH = "/tmp/processing-key.pem"
            }
            steps {
		    echo "template is updated for ${params.pipeline}"
                    }
            }
	
    	}
    }
