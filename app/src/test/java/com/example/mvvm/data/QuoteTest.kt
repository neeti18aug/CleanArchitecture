package com.example.mvvm.data

import com.example.mvvm.ui.quote.QuotesViewModel
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class QuoteTest()  {

    lateinit var quote: Quote

    @Before
    fun setup()
    {
        quote = Quote("test", "Neeti")
    }

}