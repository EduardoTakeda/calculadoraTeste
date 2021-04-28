import kotlin.system.exitProcess

var valor1: Float? = 0.0f
var valor2: Float? = 0.0f

fun main() {
    var opcao: Int?=30
    while (opcao!=0) {
        print("Escolha a operaçao:"+"\n"+" 1:adição 2:subtração 3:multiplicação 4:divisão 5:porcentagem 6:fatorial 7:potenciação 0:SAIR! ")
        opcao =readLine()!!.toIntOrNull()

        if (opcao == 1 || opcao==2 || opcao==3 || opcao==4 || opcao==5 ) {
            print("Digite o valor 1 : ")
            valor1 = readLine()?.toFloatOrNull()
            print("Digite o valor 2 : ")
            valor2 = readLine()?.toFloatOrNull()
            if (valor1 == null || valor2 == null) {
                print("erro, o valor não pode ser nulo!");exitProcess(0)
            }
            when (opcao) {
                1 -> (adicao(valor1!!, valor2!!))
                2 -> (subtracao(valor1!!,valor2!!))
                3 -> (multiplicacao(valor1!!,valor2!!))
                4 -> (divisao(valor1!!,valor2!!))
                5 -> (porcentagem(valor1!!,valor2!!))
            }
        }else{
            when (opcao) {
                6 -> fatorial()
                7 -> potenciacao()
            }
        }
    }
}

fun adicao(a:Float,b:Float) {
    val resultado = a.plus(b)
    return println("Adição $a + $b = $resultado   ")
}

fun subtracao(a:Float,b:Float) {
    val resultado = a - b
    return println("Subtração de $a - $b = $resultado   ")
}

fun multiplicacao(a:Float,b:Float) {
    val resultado = a * b
    return println("Multiplicação de $a * $b = $resultado   ")
}

fun divisao(a:Float,b:Float) {
    val resultado = a / b
    return println("Divisão de $a / $b = $resultado   ")
}

fun porcentagem(a:Float,b:Float) {
    val resultado = a * b / 100
    return println("Porcentagem $a % de $b ,valor = $resultado   ")
}

fun fatorial() {
    print("Digite o numero para Fatorial: ")
    val numeroFatorial = readLine()?.toIntOrNull()
    if (numeroFatorial == null) {
        print("erro, o número não pode ser nulo! ");exitProcess(0)
    } else {
        var resultado = 1L
        for (i in 2..numeroFatorial) resultado *= i
        println("Fatorail de $numeroFatorial é $resultado")
    }
}

fun potenciacao() {
    print("Digite a base: ")
    val numeroBase = readLine()?.toIntOrNull()
    print("Digite o expoente: ")
    val numeroExpoente = readLine()?.toIntOrNull()
    if (numeroBase == null || numeroExpoente == null) {
        print("erro, o número não pode ser nulo! ");exitProcess(0)
    } else {
        var expoente = numeroExpoente
        var resultado: Long = 1
        while (expoente != 0) {
            resultado *= numeroBase.toLong()
            --expoente
        }
        println("Potenciação de base $numeroBase e expoente $numeroExpoente = potencia $resultado")
    }
}