package com.ociweb

/**
 * Created by zak on 5/2/16.
 */
class DomainFactory {


    static Book createBook(String title = '') {
        def book = new Book(title: title)
        book.save(flush:true)

        return book
    }

}
