folder('jobs_dsl') {
  job('Clone') {
      cloneWorkspace('jenkins', String criteria = 'Any')
  }

}
