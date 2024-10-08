package bonusRacial

import Personagem

class Drow : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.carisma += 1

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 1
        )
    }
}
