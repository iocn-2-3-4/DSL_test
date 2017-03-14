pipelineJob('example') {
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
