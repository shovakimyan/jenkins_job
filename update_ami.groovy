#!groovy

pipeline {
    agent any
	
    environment {
        AWS_DEFAULT_REGION       = "us-east-1"
    }
    stages {

        stage ("Prepare Infrastructure") {
            environment {
                PROCESSING_SSH_KEY = credentials("ssh-key-processing-machine")
                PROCESSING_SSH_KEY_PATH = "/tmp/processing-key.pem"
            }
            steps {
		     echo "Prepare Infrastructure is completed successfully"
                    }
            }

	
//         stage('Update Launch Templates') {
//         when { expression { return params.update_launch_template } }
//             steps {
//                 build job: "lunch_templates_sync", parameters: [string(name: 'pipeline', value: params.pipeline_type)], propagate: false
//                 }
//             }
//     	}
    }

