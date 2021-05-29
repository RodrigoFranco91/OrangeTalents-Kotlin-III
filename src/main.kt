import br.com.rodrigo.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco("Rua Mariana", 500, "Centro",
        "Pouso Alegre", "MG", "35550-000", "Em frente a igreja")

    val endereco2 = Endereco("Rua Mariana", 500, "Centro",
        "Pouso Alegre", "MG", "35550-000", "Em frente a igreja")

    //Sem implementar o Equals & HashCode o resultado será false, pois comparará o endereço de memória
    //Com Equals & HashCode o resultado será igual!
    println(endereco.equals(endereco2))
    println()
    println(endereco.toString())
}



