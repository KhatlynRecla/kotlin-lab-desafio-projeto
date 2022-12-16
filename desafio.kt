// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
//https://pl.kotl.in/AVYsWUZBZ

//class Usuario = 1
var Usuario : Int = 1

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel : String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    
    fun matricular(usuario: Usuario) {
       //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos++         
    }
    fun cancelarMatricula(usario: Usuario){
        inscritos--
    	return inscritos
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las."
	//Formacao.inscritos(1)
    
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}