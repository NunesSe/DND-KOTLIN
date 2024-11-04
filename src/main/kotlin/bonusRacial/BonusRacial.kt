package bonusRacial

import PersonagemLIB

interface BonusRacial {
    fun aplicarBonusRacial(personagem: PersonagemLIB)
    fun retornarBonusRacial(personagem: PersonagemLIB): Map<String, Any>
}
