package mamifero.canino

import animal.Animal

open class Canino(tamanho: String, cor: String, nome: String) : Animal(tamanho, cor, nome) {

    open fun brincar() = "Brincar como um mamifero.canino"

    override fun comer() = "Comer como Canino"

    override fun fazerBarulho() = "Fazendo barulho de Canino"

}