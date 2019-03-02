package code.smells

import spock.lang.Specification

class LibraryShould extends Specification {

    def "return true when invoking (someLibraryMethod)"() {
        given:
        def library = new Library()

        expect:
        library.someLibraryMethod()
    }

}
