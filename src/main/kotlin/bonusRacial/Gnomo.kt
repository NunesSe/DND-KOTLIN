package bonusRacial

import Personagem

class Gnomo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.inteligencia += 2

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 2,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
