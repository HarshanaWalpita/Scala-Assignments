object MyApp extends App{
val x= new Rational(3,4)
println(x)
println(x.neg)
}
class Rational(n:Int, d:Int){
	def numer=n
	def denom=d
  override def toString=numer+"/"+denom
	def neg=new Rational(-numer,denom)
}
