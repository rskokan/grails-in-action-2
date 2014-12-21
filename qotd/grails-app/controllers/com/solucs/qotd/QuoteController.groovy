package com.solucs.qotd

class QuoteController {

	static defaultAction = "random"

	static scaffold = true

	def quoteService

    //def index() { }

    def home() {
    	render "<h1>Real programmer do not eat Quiche</h1>"
    }

    def random() {
    	def randomQuote = quoteService.getRandomQuote()

    	[quote: randomQuote]
    }

    def ajaxRandom() {
    	def randomQuote = quoteService.getRandomQuote()
    	render {
    		q(randomQuote.content)
    		p(randomQuote.author)
    	}
    }
}
