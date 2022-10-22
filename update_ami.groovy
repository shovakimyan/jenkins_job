#!groovy

pipeline {
    agent any
	
    environment {
        AWS_DEFAULT_REGION  = "True"
    }
	
    parameters {

        booleanParam(name: 'TOGGLE', defaultValue: false, description: 'Toggle this value')
	    
	string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')

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

