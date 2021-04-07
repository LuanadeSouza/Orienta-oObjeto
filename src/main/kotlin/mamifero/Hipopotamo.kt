package mamifero

import animal.Animal

open class Hipopotamo(tamanho: String, cor: String, nome: String) : Animal(tamanho, cor, nome) {

    open fun brincar() = "Brincar na água como um hipopotamo"

    override fun comer() = "Comer vegetais"

}