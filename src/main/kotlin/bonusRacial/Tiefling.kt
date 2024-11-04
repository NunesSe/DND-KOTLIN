package bonusRacial
import PersonagemLIB

class Tiefling : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.inteligencia += 1
        personagem.carisma += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Tiefling",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 1,
            "sabedoria" to 0,
            "carisma" to 2
        )
    }
}
