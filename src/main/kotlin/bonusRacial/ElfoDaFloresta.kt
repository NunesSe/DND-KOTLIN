package bonusRacial
import PersonagemLIB


class ElfoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.sabedoria += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Elfo da Floresta",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 1,
            "carisma" to 0
        )
    }
}
