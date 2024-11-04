package bonusRacial
import PersonagemLIB



class MeioOrc : BonusRacial {
    override fun aplicarBonusRacial(personagem: PersonagemLIB) {
        personagem.forca += 2
        personagem.constituicao += 1
    }

    override fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any> {
        return mapOf(
            "raça" to "Meio-Orc",
            "forca" to 2,
            "destreza" to 0,
            "constituicao" to 1,
            "inteligencia" to 0,
            "sabedoria" to 0,
            "carisma" to 0
        )
    }
}
