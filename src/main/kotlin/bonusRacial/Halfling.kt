package bonusRacial

import Personagem

class Halfling : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.destreza += 2

        return mapOf(
            "forca" to 0,
            "destreza" to 2,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
