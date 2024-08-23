import bonusRacial.BonusRacial

class Personagem (val bonusRacial: BonusRacial){
    var pontosDisponiveis = 27
    var forca = 8
    var destreza = 8
    var constituicao = 8
    var inteligencia = 8
    var sabedoria = 8
    var carisma = 8
    var vida = 10

    val custosAtributos = mutableMapOf(
        0 to 8,
        1 to 9,
        2 to 10,
        3 to 11,
        4 to 12,
        5 to 13,
        7 to 14,
        9 to 15
    )

    val valorModificador: Map<Int, Int> = mapOf(
        1 to -5, 2 to -4, 3 to -4,
        4 to -3, 5 to -3, 6 to -2,
        7 to -2, 8 to -1, 9 to -1,
        10 to 0, 11 to 0, 12 to 1,
        13 to 1, 14 to 2, 15 to 2,
        16 to 3, 17 to 3, 18 to 4,
        19 to 4, 20 to 5, 21 to 5,
        22 to 6, 23 to 6, 24 to 7,
        25 to 7, 26 to 8, 27 to 8,
        28 to 9, 29 to 9, 30 to 10
    )

    fun aplicaBonusRacial() {
        this.bonusRacial.aplicarBonusRacial(this);
    }

    fun distribuicaoEhValida(atributoAtual: Int, pontosGastos: Int) : Boolean {
        if(pontosGastos < 0 || pontosGastos > 9) {
            return false
        }

        if(pontosGastos == 6 || pontosGastos == 8) {
            return false
        }

        if(pontosGastos > pontosDisponiveis) {
            return false
        }

        if(atributoAtual >= custosAtributos.getValue(pontosGastos)) {
            return false
        }

        return true
    }

    fun distribuirPontosParaAtributo(atributo: String, valorAtual: Int): Int {
        mostrarTabelaAbributos();
        println("Pontos Disponiveis: $pontosDisponiveis")
        print("Quantos pontos deseja alocar em $atributo (0-9): ")
        val pontosAlocados = readln().toInt()

        if (distribuicaoEhValida(valorAtual, pontosAlocados)) {
            val novoValor = custosAtributos.getValue(pontosAlocados)
            pontosDisponiveis -= pontosAlocados
            println("Pontos alocados! $atributo atual: $novoValor")
            return novoValor
        } else {
            println("Alocação inválida!")
            return valorAtual
        }
    }

    fun mostrarTabelaAbributos() {
        println("1 ponto(s) para 9,\n" +
                "2 ponto(s) para 10,\n" +
                "3 ponto(s) para 11,\n" +
                "4 ponto(s) para 12,\n" +
                "5 ponto(s) para 13,\n" +
                "7 ponto(s) para 14,\n" +
                "9 ponto(s) para 15")
    }


    fun distribuirPontos() {
        if (pontosDisponiveis < 1) {
            println("Você não possui mais pontos disponíveis para alocar!")
            return
        }

        forca = distribuirPontosParaAtributo("FORÇA", forca)
        destreza = distribuirPontosParaAtributo("DESTREZA", destreza)
        constituicao = distribuirPontosParaAtributo("CONSTITUIÇÃO", constituicao)
        inteligencia = distribuirPontosParaAtributo("INTELIGÊNCIA", inteligencia)
        sabedoria = distribuirPontosParaAtributo("SABEDORIA", sabedoria)
        carisma = distribuirPontosParaAtributo("CARISMA", carisma)

        println("Distribuição concluída. Pontos restantes: $pontosDisponiveis")


    }

    fun calcularVida() {
        var modificadorConstituicao = valorModificador.getValue(constituicao)
        vida += modificadorConstituicao
    }
    fun criarPersonagem() {
        distribuirPontos()
        println("Aplicando bonus racial!")
        aplicaBonusRacial()
        calcularVida()
        mostrarFicha()
    }
    fun mostrarFicha() {
        println("Ficha do Personagem:")
        println("VIDA: $vida")
        println("FORÇA: $forca")
        println("DESTREZA: $destreza")
        println("CONSTITUIÇÃO: $constituicao")
        println("INTELIGÊNCIA: $inteligencia")
        println("SABEDORIA: $sabedoria")
        println("CARISMA: $carisma")
        println("Pontos Disponíveis: $pontosDisponiveis")
    }
}
