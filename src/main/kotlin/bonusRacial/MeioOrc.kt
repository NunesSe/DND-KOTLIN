package bonusRacial

import Personagem

class MeioOrc : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.forca += 2
        personagem.constituicao += 1

        return mapOf(
            "forca" to 2,
            "destreza" to 0,
            "constituicao" to 1,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
