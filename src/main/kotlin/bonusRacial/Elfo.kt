package bonusRacial
import PersonagemLIB

class Elfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.destreza += 2
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Elfo",
            "forca" to 0,
            "destreza" to 2,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
