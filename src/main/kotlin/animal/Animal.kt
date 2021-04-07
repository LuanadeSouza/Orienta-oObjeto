package animal

open class Animal (val tamanho: String, val cor: String, val nome: String): Barulho , Alimentar {
    override fun fazerBarulho() = "Barulho de animal"

    override fun comer() = "Animal Comendo"
}
