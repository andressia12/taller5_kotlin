package solucion_taller5_kotlin

class Pendulo{
    private var l :Double = 0.0
    private var a :Double = 0.0
    constructor()//constructor primario
    constructor(l:Double, a:Double){
        //Para poder usar atriburos
        this.l = l
        this.a = a
    }

    // Analizadoras

    fun getlongitud()=this.l
    fun getaceleracion()=this.a

    //Moficadoras

    fun setlongitud(nueva_l:Double){
        if(nueva_l != 0.0){
            this.l= nueva_l
        }
    }

    fun setaceleracion(nueva_a:Double){
        if(nueva_a != 0.0){
            this.a= nueva_a
        }
    }

    //Métodos de la funcion

    fun periodo_oscilacion():Double{
        val periodo = (2 * Math.PI) * Math.sqrt(a/l)
        return periodo
    }

    //Forma optimizado


}
/*
data class Pendulo2{
    private var l1: Double = 0.0
    private var a1: Double = 0.0
    constructor()//constructor primario
    constructor(l:Double, a:Double){
        //Para poder usar atriburos
        this.l1 = l
        this.a1 = a
    }

    fun setlongitud(nueva_l1:Double){
        if(nueva_l1 != 0.0){
            this.l1= nueva_l1
        }
    }

    fun setaceleracion(nueva_a1:Double){
        if(nueva_a1 != 0.0){
            this.a1= nueva_a1
        }
    }

    //Métodos de la funcion

    fun periodo_oscilacion():Double{
        val periodo1 = (2 * Math.PI) * Math.sqrt(a1/l1)
        return periodo1
    }
 */


fun main(){
    var x = Pendulo(2.0,2.0)
    x.getaceleracion()
    x.getlongitud()
    //var o = Pendulo2(2.0,2.0)
}





