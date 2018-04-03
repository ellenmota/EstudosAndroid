package estudokotlin.ellenmota.com.estudokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import estudokotlin.ellenmota.com.estudokotlin.Model.Pessoa
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arrayPessoas = ArrayList<Pessoa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nome = txtName.text
        Toast.makeText(applicationContext, nome, Toast.LENGTH_SHORT).show()

        //Mutavel = Pode ser mudado
        var mutavel = "Olá Mundo!"
        mutavel = "Não é Ola mundo, é Hellow World kkkk"

        //Imutavel = Valor constante
        val imutavel = "Imutável here"


        //Chamada e métoo que add cda usuario
        addUsuario("Ellen", "Mota", 21)
        addUsuario("Joao", "Carvalho", 19)
        addUsuario("Leticia", "Silva", 23)
        addUsuario("Judithy", "Santos", 30)

        //Chamada de método que lista os usuario
        listarUsuarios(arrayPessoas)

        //Metodos testes
        val retorno = primeiroMetodo()
        val Soma = soma(2,2)
        semRetorno()
    }

    //Primeiro Metodo
    fun primeiroMetodo():String {
       return "Primeiro método"
    }

    //Metodo soma
    fun soma(numero1:Int, numero2:Int):Int {
        return  numero1+numero2
    }

    //Metodo sem retorno
    fun semRetorno(){
        print("Método sem retorno!")
    }

    //Metodo de adicionar o usuario
    fun addUsuario(nome:String, sobrenome:String, idade:Int){

        val pessoa = Pessoa(nome,idade,sobrenome)
        arrayPessoas.add(pessoa)
    }

    //Metodo de listar os usuario
    fun listarUsuarios(arrayPessoas:ArrayList<Pessoa>){
        println(arrayPessoas)
    }
}
