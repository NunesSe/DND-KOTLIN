package bonusRacial
import Personagem

class Anao : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.constituicao += 2
    }
}