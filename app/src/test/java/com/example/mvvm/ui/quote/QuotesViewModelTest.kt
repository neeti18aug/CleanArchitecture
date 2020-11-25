package com.example.mvvm.ui.quote

import com.example.mvvm.data.FakeQuoteDao
import com.example.mvvm.data.Quote
import com.example.mvvm.data.QuoteRepository
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock

@RunWith(JUnit4::class)
class QuotesViewModelTest{
    lateinit var quotesViewModel: QuotesViewModel
    lateinit var quoteRepository: QuoteRepository
    lateinit var fakedao: FakeQuoteDao
    lateinit var quote: Quote

    @Before
    fun setup()
    {
        fakedao= FakeQuoteDao()
        quoteRepository= QuoteRepository.getInstance(fakedao)
        quotesViewModel= QuotesViewModel(quoteRepository)

        quote = Quote("Be Positive","Neeti")
    }

    @Test
    fun getQuotation(){
        var status = quotesViewModel.getQuotes()
        assertEquals(status,true)
    }
    @Test
    fun addQuotation(){
        var status = quotesViewModel.addQuotes(quote)
        assertEquals(status,true)
    }

}