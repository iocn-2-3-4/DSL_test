job('example') {
    description('My first job')
    displayName('example')
    environmentVariables {
        script('''
           mkdir -p tests
           rm -rf /tmp/tests.tmp
        ''')
    }
    steps {
        groovyScriptFile('generateReports.groovy') {
            groovyInstallation('groovy-2.4.2')
            scriptParam('target/reports')
        }
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
