package bonusRacial

import PersonagemLIB

class Anao : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.constituicao += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Anão",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 2,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
