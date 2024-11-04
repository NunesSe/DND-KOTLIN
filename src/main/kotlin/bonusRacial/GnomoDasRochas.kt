package bonusRacial
import PersonagemLIB


class GnomoDasRochas : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.constituicao += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Gnomo das Rochas",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 1,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
