package bonusRacial
import PersonagemLIB


class Draconato : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.forca += 2
        personagem.carisma += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Draconato",
            "forca" to 2,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 1
        )
    }
}
