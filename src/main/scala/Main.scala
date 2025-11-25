object Main {

  def runExample() { // Problema 1: Chaves de abertura na mesma linha (Style)
    val unusedVar = 10 // Problema 2: Variável não utilizada (Lint)
    import scala.collection.mutable.ArrayBuffer // Problema 3: Import não utilizado (Lint)
    println("Olá, Scala!") // Linha muito longa para o Scalafmt
  }

  def main(args: Array[String]): Unit = {
    runExample()
  }

}
