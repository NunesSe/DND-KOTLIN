package bonusRacial
import Personagem

class GnomoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 1
    }
}