package bonusRacial
import Personagem

class Drow : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 1
    }
}