import bonusRacial.*

class PersonagemLIB (var bonusRacial: BonusRacial){
    var nome: String = ""
    var forca: Int = 8
    var destreza: Int = 8
    var constituicao: Int = 8
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8
    private var pontosDisponiveis: Int = 27

    private val tabelaCustos = mapOf(
        8 to 0, 9 to 1, 10 to 2, 11 to 3,
        12 to 4, 13 to 5, 14 to 7, 15 to 9
    )

    fun calcularCusto(atributo: Int): Int = tabelaCustos[atributo] ?: 0

    fun alterarAtributo(atributo: String, novoValor: Int): Boolean {
        if (novoValor < 8 || novoValor > 15) return false

        val custoAtual = calcularCusto(getAtributo(atributo))
        val custoNovo = calcularCusto(novoValor)
        val custoDiferenca = custoNovo - custoAtual

        return if (pontosDisponiveis >= custoDiferenca) {
            pontosDisponiveis -= custoDiferenca
            setAtributo(atributo, novoValor)
            true
        } else {
            false
        }
    }

    private fun getAtributo(nome: String): Int = when (nome) {
        "forca" -> forca
        "destreza" -> destreza
        "constituicao" -> constituicao
        "inteligencia" -> inteligencia
        "sabedoria" -> sabedoria
        "carisma" -> carisma
        else -> 8
    }

    private fun setAtributo(nome: String, valor: Int) {
        when (nome) {
            "forca" -> forca = valor
            "destreza" -> destreza = valor
            "constituição" -> constituicao = valor
            "inteligencia" -> inteligencia = valor
            "sabedoria" -> sabedoria = valor
            "carisma" -> carisma = valor
        }
    }

    fun getPontosDisponiveis(): Int = pontosDisponiveis
    fun setPontosDisponiveis(pontos : Int) {
        this.pontosDisponiveis = pontos
    }

    fun alterarRaca(raca: String) {
        bonusRacial = when (raca) {
            "Alto Elfo" -> AltoElfo()
            "Anão" -> Anao()
            "Anão da Colina" -> AnaoDaColina()
            "Anão da Montanha" -> AnaoDaMontanha()
            "Draconato" -> Draconato()
            "Drow" -> Drow()
            "Elfo" -> Elfo()
            "Elfo da Floresta" -> ElfoDaFloresta()
            "Gnomo" -> Gnomo()
            "Gnomo da Floresta" -> GnomoDaFloresta()
            "Gnomo das Rochas" -> GnomoDasRochas()
            "Halfling" -> Halfling()
            "Halfling Pés Leves" -> HalflingPesLeves()
            "Halfling Robusto" -> HalflingRobusto()
            "Humano" -> Humano()
            "Meio-Elfo" -> MeioElfo()
            "Meio-Orc" -> MeioOrc()
            "Tiefling" -> Tiefling()
            else -> BonusRacialPadrao()
        }
    }

    fun retornarBonusRacial(): Map<String, Any> {
        return bonusRacial.retornarBonusRacial(this)
    }

    fun aplicarBonusRacial() {
        bonusRacial.aplicarBonusRacial(this)
    }

    fun calcularModificador(valor: Int): Int {
        return when (valor) {
            1 -> -5
            in 2..3 -> -4
            in 4..5 -> -3
            in 6..7 -> -2
            in 8..9 -> -1
            in 10..11 -> 0
            in 12..13 -> 1
            in 14..15 -> 2
            in 16..17 -> 3
            in 18..19 -> 4
            in 20..21 -> 5
            in 22..23 -> 6
            in 24..25 -> 7
            in 26..27 -> 8
            in 28..29 -> 9
            30 -> 10
            else -> throw IllegalArgumentException("Valor do atributo fora do intervalo permitido (1-30)")
        }
    }
}
