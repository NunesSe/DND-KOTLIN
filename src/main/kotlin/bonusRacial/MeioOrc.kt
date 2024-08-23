package bonusRacial
import Personagem

class MeioOrc : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 1
    }
}