pipelineJob('e_pipeline') {
    definition {
        cpsScm {
            scm {
                git ('https://github.com/iocn-2-3-4/DSL_test.git')
                scriptPath ('https://github.com/iocn-2-3-4/DSL_test/edit/master/e_script.groovy')
            }
        }
    }
}
