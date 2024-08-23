package bonusRacial
import Personagem

class GnomoDasRochas : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.constituicao += 1
    }
}