object MyApp extends App{
val p1 =new Point(2,3)
val p2 =new Point(1,2)
val p3 =p1.distance(p2)

println(p3)
}
case class Point(a: Double, b: Double){
  def x:Double=a
  def y:Double=b
  import math.{ sqrt, pow }
  override def toString = "("+x+","+y+")"

  def distance(p: Point): Double=sqrt(pow(x - p.x, 2) + pow(y - p.y, 2))
}
