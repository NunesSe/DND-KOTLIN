package bonusRacial

import Personagem

class MeioElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.carisma += 2

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 2
        )
    }
}
