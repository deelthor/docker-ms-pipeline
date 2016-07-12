pipelineJob('microservice-sample-pipeline') {
    definition {
        cpsScm{
          scm{
          	git('https://github.com/deelthor/docker-ms-pipeline.git')
          }
          scriptPath('jenkins/pipelineJob.groovy')	
        }
    }
}
