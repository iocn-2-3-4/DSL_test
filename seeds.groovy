pipelineJob('example') {
  scm {
    git ('https://github.com/pingwin4ik/dsl.git')
  }
    triggers {
     scm('H/2 * * * *')
  } 
  steps {
    dsl {
      external('jenkinsfile')  
    }
  }
  deliveryPipelineConfiguration('Build', 'Build')


}
