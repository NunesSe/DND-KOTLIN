package bonusRacial

import Personagem

class Draconato : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.forca += 2
        personagem.carisma += 1

        return mapOf(
            "forca" to 2,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 1
        )
    }
}
