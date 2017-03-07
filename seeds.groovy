pipelineJob('example') {
  scm {
    git ('https://github.com/pingwin4ik/dsl.git')
  }
     steps {
    dsl {
      external('jenkinsfile')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }

}
