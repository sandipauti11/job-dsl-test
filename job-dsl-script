job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/sandipauti11/job-dsl-test.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
