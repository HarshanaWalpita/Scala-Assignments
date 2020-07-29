object MyApp extends App{
val x= new Rational(3,4)
val y= new Rational(5,8)
val z= new Rational(2,7)
val a=x.sub(y).sub(z)
println(a)
}
class Rational(n:Int, d:Int){
  require(d>0, "d must be greater than 0")
	def numer=n/gcd(Math.abs(n),d)
	def denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(3,4)
  private def gcd(a:Int, b:Int):Int=if(b==0)a else gcd(b,a%b)
  def add(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
  def sub(r:Rational) = this.add(r.neg)
  def neg=new Rational(-this.numer,this.denom)
  override def toString=numer+"/"+denom
}
