job('Seed All') {
  scm {
    git ('https://github.com/iocn-2-3-4/DSL_test.git')
  }
  steps {
    dsl {
      external('*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
