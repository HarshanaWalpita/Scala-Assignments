object MyApp extends App{
    var Ac1 = new Account("971701617V",20200729, 25000.25)
    var Ac2 = new Account("971701617V",20200729, -1250.50)
    var Ac3 = new Account("971701617V",20200729, 3000.55)
    var Ac4 = new Account("971701617V",20200729, -230.40)
    var Ac5 = new Account("971701617V",20200729, 5611.74)
    var Ac6 = new Account("971701617V",20200729, -234.56)
    var Ac7 = new Account("971701617V",20200729, 4356.43)
    var Ac8 = new Account("971701617V",20200729, -5000.00)
    var Ac9 = new Account("971701617V",20200729, 634.13)
    var Ac10 = new Account("971701617V",20200729, 1457.23)

    var Bank:List[Account]=List(Ac1,Ac2,Ac3,Ac4,Ac5,Ac6,Ac7,Ac8,Ac9,Ac10)

    //question 4.1
   val negAccounts = Bank.filter(x=>x.balance<0)
   println("List of Accounts with negative balances : \n")
   for(element<-negAccounts){
     println(element)
   }
   println("\n")

   //question 4.2
   var list = Bank.map(x=>x.balance)
   val sum = list.reduce((x,y) =>x+y)
   println("Sum of the all account balances : \n ")
   println(sum)
   println("\n")

   //question 4.3
   Bank.map(x=>if(x.balance>0) x.balance=(x.balance)*1.05 else x.balance=(x.balance)*1.1)
   println("Final balances of all accounts after apply the interest : \n")
   for(element<-Bank){
    println(element)
   }
}
class Account(id:String, n:Int, b:Double){
    val nic: String = id
    val acnumber : Int = n
    var balance : Double = b

    override def toString = nic+"  "+acnumber+"  "+balance

    def withdraw(amount:Double)= {
        this.balance=this.balance-amount
        if (this.balance<0) println("Balance is insufficient")
    }
    def deposit(amount:Double) = this.balance=this.balance+amount

    def transfer(acc:Account,amount:Double)= {
        this.balance=this.balance-amount
        acc.balance=acc.balance+amount
        if (this.balance<0) println("Balance is insufficient")
    }
}
