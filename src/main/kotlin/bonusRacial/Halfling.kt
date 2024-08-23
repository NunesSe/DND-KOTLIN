package bonusRacial
import Personagem

class Halfling : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 2
    }
}