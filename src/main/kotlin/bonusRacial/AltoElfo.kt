package bonusRacial
import Personagem

class AltoElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.inteligencia += 1
    }
}