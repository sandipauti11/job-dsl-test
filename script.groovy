job('DSL-Tutorial-1-Test') {
    scm {
        https://github.com/sandipauti11/HelloWorld.git
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
