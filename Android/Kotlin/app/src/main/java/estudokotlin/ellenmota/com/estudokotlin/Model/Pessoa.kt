package estudokotlin.ellenmota.com.estudokotlin.Model

/**
 * Created by ellenmota on 02/04/2018.
 */

class Pessoa {

    var nome:String
    var idade:Int
    var sobrenome:String

    constructor(nome:String, idade:Int, sobrenome:String){
        this.nome = nome
        this.idade = idade
        this.sobrenome = sobrenome
    }
}