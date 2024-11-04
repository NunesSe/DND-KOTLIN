package bonusRacial
import PersonagemLIB


class MeioElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.carisma += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Meio-Elfo",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 2
        )
    }
}
