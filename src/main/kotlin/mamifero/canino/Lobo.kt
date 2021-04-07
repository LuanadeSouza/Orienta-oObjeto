package mamifero.canino

open class Lobo(tamanho: String, cor: String, nome: String) : Canino(tamanho, cor, nome) {

    override fun comer() = "Caçar outros animais"

    override fun fazerBarulho() = "Uivando"

}