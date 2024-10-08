package bonusRacial

import Personagem

class HalflingRobusto : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.constituicao += 1

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 1,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
