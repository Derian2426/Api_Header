package com.example.api_header

class Metal {
    var timestamp:Int=0
    var metal:String=""
    var currency:String=""
    var exchange:String=""
    var symbol:String=""
    var prev_close_price:Double=0.0
    var open_price:Double=0.0
    var low_price:Double=0.0
    var high_price:Double=0.0
    var open_time:Long=0
    var price:Double=0.0
    var ch:Double=0.0
    var chp:Double=0.0
    var ask:Double=0.0
    var bid:Double=0.0
    var price_gram_24k:Double=0.0
    var price_gram_22k:Double=0.0
    var price_gram_21k:Double=0.0
    var price_gram_20k:Double=0.0
    var price_gram_18k:Double=0.0

    constructor(
        timestamp: Int,
        metal: String,
        currency: String,
        exchange: String,
        symbol: String,
        prev_close_price: Double,
        open_price: Double,
        low_price: Double,
        high_price: Double,
        open_time: Long,
        price: Double,
        ch: Double,
        chp: Double,
        ask: Double,
        bid: Double,
        price_gram_24k: Double,
        price_gram_22k: Double,
        price_gram_21k: Double,
        price_gram_20k: Double,
        price_gram_18k: Double
    ) {
        this.timestamp = timestamp
        this.metal = metal
        this.currency = currency
        this.exchange = exchange
        this.symbol = symbol
        this.prev_close_price = prev_close_price
        this.open_price = open_price
        this.low_price = low_price
        this.high_price = high_price
        this.open_time = open_time
        this.price = price
        this.ch = ch
        this.chp = chp
        this.ask = ask
        this.bid = bid
        this.price_gram_24k = price_gram_24k
        this.price_gram_22k = price_gram_22k
        this.price_gram_21k = price_gram_21k
        this.price_gram_20k = price_gram_20k
        this.price_gram_18k = price_gram_18k
    }

    constructor()

}