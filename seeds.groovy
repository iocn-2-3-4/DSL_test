job('Seeds_test') {
  scm {
    git ('https://github.com/iocn-2-3-4/git_1.git')
  }
  steps {
    shell 'ls -l'
  }
}
