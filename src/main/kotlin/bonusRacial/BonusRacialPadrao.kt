package bonusRacial
import PersonagemLIB

class BonusRacialPadrao : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Int> {
        return mapOf(
            "forca" to 0,
            "destreza" to 0,
            "constituicao" to 0,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
