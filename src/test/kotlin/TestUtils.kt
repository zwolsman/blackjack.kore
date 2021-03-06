import com.zwolsman.blackjack.core.deck.card.Card

fun String.toCard() = Card.fromString(this)
fun String.toCards() = this.split(",").map { it.trim().toCard() }