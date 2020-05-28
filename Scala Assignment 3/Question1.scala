def gcd(x:Int,y:Int):Int= y match{
	case 0 => x
	case y if (y>x) => gcd(y,x)
	case _ => gcd(y,x%y)	
}

def prime(a:Int,b:Int=2):Boolean=b match{
	case x if(a==x)=> true
	case x if(gcd(a,x)>1)=>false
	case x =>prime(a,x+1)	
}

println(prime(5))
println(prime(8))