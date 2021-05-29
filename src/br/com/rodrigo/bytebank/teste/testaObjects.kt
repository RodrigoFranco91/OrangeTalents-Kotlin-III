package br.com.rodrigo.bytebank.teste

import br.com.rodrigo.bytebank.modelo.Autenticavel
import br.com.rodrigo.bytebank.modelo.Conta
import br.com.rodrigo.bytebank.modelo.SistemaInterno

fun testaObjects() {
    println("Total contas: ${Conta.total}")

    val objetoAnonimo = object : Autenticavel {
        val nome = "Rogerio"
        val cpf = "123.456.123-55"
        val senha = 1234
        override fun autentica(senha: Int): Boolean {
            if (this.senha == senha) {
                return true
            }
            return false
        }
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(objetoAnonimo, 1234)
}