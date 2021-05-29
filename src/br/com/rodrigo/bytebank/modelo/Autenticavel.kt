package br.com.rodrigo.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}