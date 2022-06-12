package solucion_taller5_kotlin
class Asensor{

    private var num_pisos: Int = 0
    private var num_sotanos: Int = 0
    private var piso_actual: Int = 1

    constructor()//constructor primario
    constructor(num_pisos:Int, num_sotanos:Int, piso_actual:Int){
        //Para poder usar atriburos
        this.num_pisos = num_pisos
        this.num_sotanos = num_sotanos
        this.piso_actual = piso_actual
    }

// Analizadoras

    fun getnumpisos()=this.num_pisos
    fun getnumsotanos()=this.num_sotanos
    fun getpisoactual()=this.piso_actual

    //Moficadoras

    fun setlnumpisos(nuevo_num_pisos:Int){
        if(nuevo_num_pisos != 0){
            this.num_pisos= nuevo_num_pisos
        }
    }

    fun setnumsotanos(nuevo_num_sotanos:Int){
        if(nuevo_num_sotanos != 0){
            this.num_sotanos= nuevo_num_sotanos
        }
    }

    fun setpisoactual(nuevo_piso_actual:Int){
        if(nuevo_piso_actual != 0){
            this.piso_actual= nuevo_piso_actual

        }

    }

    //Métodos de la funcion
    //Íitem 1
    fun siguiente_piso(p:Int):Int{

            var piso = 1
            if (piso_actual <= num_pisos){
                piso = piso_actual++

            }
    return piso
    }

    fun piso_descendente (pd:Int):Int{
        var sotano = -1
        if(piso_actual >= num_sotanos){
            sotano = piso_actual--
            if(sotano==0){
                sotano--
            }
        }
        return sotano
    }

    fun pisos_edificio():Int{
        var total =  num_pisos + num_sotanos -1
        return total
    }

    fun main(){

        var asensor : Asensor = Asensor()
        var x = Asensor (5,3,1)
        x.getnumpisos()
        x.getnumsotanos()
        x.getpisoactual()

        /*
        print("Digite el numero de pisos del edificio: ")
        var num_pisos = readLine()!!.toInt()
        print("Digite el numero de sotanos del edificio: ")
        var num_sotanos = readLine()!!.toInt()

        print("El siguiente piso que puede quedar el asensor es el piso ${siguiente_piso(num_pisos)}")
        print("El piso anterior  que puede quedar el asensor es el piso ${piso_descendente(num_pisos)}")
        print("El total de pisos del edifico contando los sotanos son:  ${pisos_edificio()}")
         */


    }

}