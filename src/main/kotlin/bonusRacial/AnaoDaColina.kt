package bonusRacial

import PersonagemLIB

class AnaoDaColina : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.sabedoria += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Anão da Colina",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 1,
            "carisma" to 0
        )
    }
}
