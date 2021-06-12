package com.example.wisdom.data

import com.example.wisdom.R

class SenekaQuote{

    fun loadQuote(): List<Quote> {

        return listOf(
            Quote(R.string.seneka1),
            Quote(R.string.seneka2),
            Quote(R.string.seneka3),
            Quote(R.string.seneka4),
            Quote(R.string.seneka5),
            Quote(R.string.seneka6),
            Quote(R.string.seneka7)
        )
    }
}