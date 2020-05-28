def fibonacci(x:Int):Int=x match{
	case x if x==0 => 0
	case x if x==1 => 1
	case x => fibonacci(x-1)+fibonacci(x-2)	
}

def fibonacci_sequnce(x:Int):Any={
	if (x>0) fibonacci_sequnce(x-1)
		println(fibonacci(x))
}
println(fibonacci_sequnce(10))