object MyApp extends App{
val p1 =new Point(2,3)
val p2 =p1.move(1,2)

println(p2)
}
case class Point(a:Int, b:Int){
  def x:Int=a
  def y:Int=b

  override def toString = "("+x+","+y+")"
  def move(dx:Int, dy:Int)=Point(this.x+dx,this.y+dy)
}
