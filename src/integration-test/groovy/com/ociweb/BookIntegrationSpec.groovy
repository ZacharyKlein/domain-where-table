package com.ociweb


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class BookIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"Book has correct title"
            book.title == title

        where:
        book                                |title
        DomainFactory.createBook('a')       |'a'
        DomainFactory.createBook('b')       |'b'
        DomainFactory.createBook('c')       |'c'
    }
}
