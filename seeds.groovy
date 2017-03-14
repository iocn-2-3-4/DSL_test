job('example') {
    logRotator(-1, 10)
    jdk('Java 6')
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        gradle('clean build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
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
