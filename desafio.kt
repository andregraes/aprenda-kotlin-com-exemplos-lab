enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var nivel: Nivel, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
        println("Conteúdo ${conteudo.nome} adicionado à formação $nome.")
    }

    fun removerConteudo(conteudo: ConteudoEducacional) {
        conteudos.remove(conteudo)
        println("Conteúdo ${conteudo.nome} removido da formação $nome.")
    }
}

fun main() {
    // Criando alguns usuários
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados")

    // Criando uma formação
    val formacao = Formacao("Formação em Ciência da Computação", Nivel.INTERMEDIARIO)

    // Adicionando conteúdos à formação
    formacao.adicionarConteudo(conteudo1)
    formacao.adicionarConteudo(conteudo2)
    formacao.adicionarConteudo(conteudo3)

    // Matriculando usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Removendo conteúdo da formação
    formacao.removerConteudo(conteudo3)
}

