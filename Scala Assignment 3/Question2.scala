def prime(a:Int,b:Int=2):Boolean={
	if(a<=2) if(a<2) false else true
    else if(a%b==0)  false
	else if(b*b>a)  true
	else  prime(a,b+1)
}

def primeSeq(a:Int):Unit={
	if(a>0) primeSeq(a-1)
	if(prime(a)) println(a) 
}

println(primeSeq(10));

