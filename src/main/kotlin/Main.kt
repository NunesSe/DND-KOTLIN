import bonusRacial.Anao

fun main(args: Array<String>) {
    var p = Personagem(Anao())
    p.forca = p.distribuirPontosParaAtributo("forca" ,p.forca, 2)
    println("${p.pontosDisponiveis}  +  ${p.forca}")
}
