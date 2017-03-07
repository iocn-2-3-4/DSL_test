pipelineJob('example') {
  scm {
    git ('https://github.com/pingwin4ik/dsl.git')
  }
    triggers {
     scm('H/2 * * * *')
  } 
    definition {
        cps {
            script(readFileFromWorkspace('jenkinsfile'))
            sandbox()
        }
    }


}
