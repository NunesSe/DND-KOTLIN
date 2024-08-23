package bonusRacial
import Personagem

class Elfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 2
    }
}