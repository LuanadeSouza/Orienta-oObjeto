package mamifero.felino

class Gato(tamanho: String, cor: String, nome: String) : Felino(tamanho, cor, nome) {

    override fun brincar() = "Brincar como um gato"

    override fun comer() = "Comer Ração "

    override fun fazerBarulho() = "Miau Miau"

}