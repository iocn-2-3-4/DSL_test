job('example') {
    description('My first job')
    displayName('Job DSL Example Project')
    environmentVariables {
        script('''
           mkdir -p tests
           rm -rf /tmp/tests.tmp
        ''')
    }
}

pipelineJob('pipeline') {
  scm {
    git ('https://github.com/pingwin4ik/dsl.git')
  }
    triggers {
     scm('* * * * *')
  } 
    definition {
        cps {
            script(readFileFromWorkspace('jenkinsfile'))
            sandbox()
        }
    }


}
