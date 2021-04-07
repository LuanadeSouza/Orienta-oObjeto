package mamifero.canino

open class Cachorro(tamanho: String, cor: String, nome: String) : Canino(tamanho, cor, nome) {

     override fun brincar() = "Brincar como um cachorro"

    override fun comer() = "Comer um osso"

    override fun fazerBarulho() = "AU AU AU"

}