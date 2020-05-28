def is_even(x:Int):Boolean= x match{
	case 0 => true
	case _ => is_odd(x-1)
}

def is_odd(x:Int):Boolean = !(is_even(x))

println(is_even(4))
println(is_even(5))
println(is_odd(8))
println(is_odd(9))

	