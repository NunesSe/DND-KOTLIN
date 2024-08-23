package bonusRacial
import Personagem

class ElfoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}