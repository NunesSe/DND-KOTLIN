package bonusRacial

import PersonagemLIB


class AltoElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.inteligencia += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Alto Elfo",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 1,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
