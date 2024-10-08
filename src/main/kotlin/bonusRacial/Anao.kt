package bonusRacial

import Personagem

class Anao : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.constituicao += 2

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 2,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
