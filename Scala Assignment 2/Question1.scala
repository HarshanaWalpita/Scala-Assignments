def normal_working_salary(x:Int)=x*150
def ot_working_salary(x:Int)=x*75
def full_salary(x:Int,y:Int)=normal_working_salary(x)+ot_working_salary(y)
def tax(full_salary:Int)=full_salary*.1
def final_salary(x:Int,y:Int)=full_salary(x,y)-tax(full_salary(x,y))
println(final_salary(40,20))