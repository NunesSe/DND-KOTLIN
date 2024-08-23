package bonusRacial
import Personagem

class AnaoDaColina : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}