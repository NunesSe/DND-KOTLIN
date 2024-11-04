package bonusRacial
import PersonagemLIB


class GnomoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.destreza += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Gnomo da Floresta",
            "forca" to 0,
            "destreza" to 1,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
