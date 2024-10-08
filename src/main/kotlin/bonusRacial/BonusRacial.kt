package bonusRacial

import Personagem

interface BonusRacial {
    fun aplicarBonusRacial(personagem: Personagem): Map<String, Int>
}
