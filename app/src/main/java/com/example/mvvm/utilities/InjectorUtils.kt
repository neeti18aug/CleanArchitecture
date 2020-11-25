package com.example.mvvm.utilities

import com.example.mvvm.data.FakeDatabase
import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.ui.quote.QuoteViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuoteViewModelFactory {
        var quoteRepository = QuoteRepository.getInstance(FakeDatabase.quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}