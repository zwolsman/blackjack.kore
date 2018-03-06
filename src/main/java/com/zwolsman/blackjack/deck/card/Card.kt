package com.zwolsman.blackjack.deck.card

data class Card(val suit: Suit, val rank: Rank) {
    override fun toString() = "Card($icon)"

    val icon:String
        get() = "${suit.icon} ${rank.icon}"
}