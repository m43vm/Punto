import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    val p0 = Punto()
    val p1 = Punto(3.0, 2.0)
    p0.mover(2.0, 3.0)
    println("p0 movido: $p0")
    println("Distancia entre p0 y p1: ${p0.distancia(p1)}")
    val suma = p0.operadorMas(p1)
    val resta = p0.operadorMenos(p1)
    println("Suma: $suma")
    println("Resta: $resta")
    val p2 = Punto(5.0, 5.0)
    println("¿p1 == p2? ${p1.equals(p2)}")
}
class Punto(var x: Double = 0.0, var y: Double = 0.0){
    
    fun mover(moverX: Double, moverY: Double){
        this.x += moverX
        this.y += moverY
    }
    fun distancia(otroPunto : Punto): Double{
        val dx = otroPunto.x - this.x
        val dy = otroPunto.y - this.y
        return sqrt(dx.pow(2) + dy.pow(2))
    }
    fun operadorMas(puntoO: Punto): Punto{
       val solX = this.x + puntoO.x
       val solY = this.y + puntoO.y 
       return Punto(solX, solY)
    }
    fun operadorMenos(puntoO: Punto): Punto{
       val solX = this.x - puntoO.x
       val solY = this.y - puntoO.y 
       return Punto(solX, solY)
    }
    override fun equals(other: Any?): Boolean { //any es object y puede ser null
    	if (this === other) return true //en memoria
    	if (other !is Punto) return false //que sea punto
    	return this.x == other.x && this.y == other.y
	}
    override fun toString(): String {
        return "Punto(x=$x, y=$y)"
    }
    
}