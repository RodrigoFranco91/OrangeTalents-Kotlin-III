package br.com.rodrigo.bytebank.modelo



class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank - Autenticado!")
        } else {
            println("Falha na autenticação")
        }
    }

}