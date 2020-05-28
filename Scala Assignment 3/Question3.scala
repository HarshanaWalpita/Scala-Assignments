def sum(x:Int):Int={
	if (x==1) 1 else x+sum(x-1)
}

println(sum(5))