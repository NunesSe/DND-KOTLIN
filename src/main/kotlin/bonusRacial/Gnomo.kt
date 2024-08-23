package bonusRacial
import Personagem

class Gnomo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.inteligencia += 2
    }
}