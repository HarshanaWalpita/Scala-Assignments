object MyApp extends App{
val p1 =new Point(2,3)
val p2 =new Point(1,2)
val p3 =p1.add(p2)

println(p3)
}
case class Point(a:Int, b:Int){
  def x:Int=a
  def y:Int=b

  override def toString = "("+x+","+y+")"
  def add(p:Point)=new Point(this.x+p.x,this.y+p.y)
}
