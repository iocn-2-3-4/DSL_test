folder('jobs_dsl') {
  job('Clone') {
      cloneWorkspace('jenkins', criteria = 'Any')
  }

}
