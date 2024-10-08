package bonusRacial

import Personagem

class ElfoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.sabedoria += 1

        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 1,
            "carisma" to 0
        )
    }
}
