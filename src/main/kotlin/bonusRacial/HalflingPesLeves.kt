package bonusRacial
import Personagem

class HalflingPesLeves : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 1
    }
}