package bonusRacial
import PersonagemLIB

class Halfling : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.destreza += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Halfling",
            "forca" to 0,
            "destreza" to 2,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
