def attendees(x:Int):Int=120+(15-x)/5*20
def revenue(x:Int):Int = attendees(x)*x
def cost(x:Int):Int=500+attendees(x)*3
def profit(x:Int):Int =revenue(x)- cost(x)
println(profit(5))
println(profit(10))
println(profit(15))
println(profit(20))
println(profit(25))
println(profit(30))
println(profit(35))
println(profit(40))
println(profit(45))
println(profit(50))