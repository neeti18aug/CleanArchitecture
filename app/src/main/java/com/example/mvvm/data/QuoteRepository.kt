package com.example.mvvm.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote:Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuote()


    companion object{
        @Volatile private var instance: QuoteRepository?= null

        var quoteDao = FakeQuoteDao()
            private set

        fun getInstance(quoteDao: FakeQuoteDao) = instance?: synchronized(this)
        {
            instance?: QuoteRepository(quoteDao).also { instance = it }
        }
    }
}