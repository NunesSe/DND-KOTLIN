package bonusRacial
import Personagem

class MeioElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 2
    }
}