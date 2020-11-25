package com.example.mvvm.ui.quote

import androidx.lifecycle.ViewModel
import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.data.Quote

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)

}