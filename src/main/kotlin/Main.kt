// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {

    inscritos.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na formação $nome.")
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 90)
    val conteudo3 = ConteudoEducacional("Coroutines e Assíncrono")

    val formacao = Formacao("Formação em Desenvolvimento Android", listOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Inscritos na formação ${formacao.nome}: ${formacao.inscritos.size}")

}