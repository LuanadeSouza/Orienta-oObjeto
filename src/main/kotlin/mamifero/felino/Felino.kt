package mamifero.felino

import animal.Animal

open class Felino(tamanho: String, cor: String, nome: String) : Animal(tamanho, cor, nome) {

    open fun brincar() = "Brincar como um mamifero.felino"

    override fun comer() = "Comer como Felino"

    override fun fazerBarulho() = "Fazendo barulho de mamifero.felino"

}