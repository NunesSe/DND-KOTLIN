package bonusRacial
import PersonagemLIB

class Gnomo : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.inteligencia += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Gnomo",
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 2,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
