package bonusRacial

import Personagem

class Tiefling : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.inteligencia += 1
        personagem.carisma += 2

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 1,
            "sabedoria" to 0,
            "carisma" to 2
        )
    }
}
