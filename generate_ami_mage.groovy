pipelineJob('aws/ec2/generate_ami_image') {
    def repo = 'https://github.com/shovakimyan/jenkins_job.git'

    description('Pipelines AMI image generation')
    displayName('AMI generation')

    parameters {
        choiceParam('pipeline_type', [
            'deep_learning',
            'analytics'
        ], 'Choose the pipeline type for which AMI will be generated.')
        booleanParam(name: 'Update lunch templates', defaultValue: true)
    }

   
    
