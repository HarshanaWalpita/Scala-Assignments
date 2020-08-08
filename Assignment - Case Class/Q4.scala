object MyApp extends App{
val p1 =new Point(2,3)
val p2 =p1.invert

println(p2)
}
case class Point(a:Int, b:Int){
  def x:Int=a
  def y:Int=b

  override def toString = "("+x+","+y+")"
  def invert={Point(this.y, this.x)}
}
