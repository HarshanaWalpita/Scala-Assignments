def is_even(x:Int):String= x match{
	case 0 => "True"
	case 1 => "False"	
	case _ => is_even(x-2)
}

def sum(x:Int):Int= x match{
	case 0 => 0;
	case x if(is_even(x)=="True") => x+sum(x-1)
	case x if(is_even(x)=="False") => 0+sum(x-1)	
}

println(sum(6))