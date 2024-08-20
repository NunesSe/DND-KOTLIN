package bonusRacial

import Personagem

class AnaoMontanha : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
    }
}