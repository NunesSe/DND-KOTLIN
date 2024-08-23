package bonusRacial
import Personagem

class Draconato : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
        personagem.carisma += 1
    }
}