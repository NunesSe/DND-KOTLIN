package bonusRacial

import Personagem

class Humano : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem): Map<String, Int> {
        personagem.forca += 1
        personagem.destreza += 1
        personagem.sabedoria += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
        personagem.carisma += 1

        return mapOf(
            "forca" to 1,
            "destreza" to 1,
            "constituicao" to 1,
            "inteligencia" to 1,
            "sabedoria" to 1,
            "carisma" to 1
        )
    }
}
