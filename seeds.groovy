job('Seeds_test') {
  scm {
    git ('https://github.com/iocn-2-3-4/DSL_test.git')
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
