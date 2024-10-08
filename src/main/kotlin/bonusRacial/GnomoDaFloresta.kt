package bonusRacial

import Personagem

class GnomoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.destreza += 1

        return mapOf(
            "forca" to 0,
            "destreza" to 1,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
