package bonusRacial
import Personagem

class HalflingRobusto : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.constituicao += 1
    }
}