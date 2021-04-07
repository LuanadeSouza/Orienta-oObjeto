package mamifero.felino

open class Leao(tamanho: String, cor: String, nome: String) : Felino(tamanho, cor, nome) {

    override fun comer() = "Caçar outros animais"

    override fun fazerBarulho() = "Rugindo"

}