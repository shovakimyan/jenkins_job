pipelineJob('aws/ec2/lunch_templates_sync') {
    def repo = 'https://github.com/intelinair/infrastructure.git'

    description('AG lunch templates update with new AMI image')
    displayName('update_launch_template')


    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(repo)

                    }
                    branch('*/main')
                    scriptPath('jobs/update_launch_template.groovy')
                    extensions {
                        pruneBranches()
                        gitLFSPull()
                    }
                }
            }
        }
    }
}
