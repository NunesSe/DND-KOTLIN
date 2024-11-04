package bonusRacial
import PersonagemLIB


class HalflingPesLeves : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.carisma += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Halfling Pés-Leves",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 1
        )
    }
}
