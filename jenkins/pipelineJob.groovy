node('microservice-sample') {
  
  stage 'CHECKOUT'
  
  deleteDir()
 
  retry(5) {
    git url: "https://github.com/deelthor/docker-ms-pipeline", branch: "master", poll: true"
  }  
  
  stage 'BUILD'
  
  dir('sample-microservice') {
    sh "mvn -Dmaven.test.failure.ignore clean package"
  }
}
