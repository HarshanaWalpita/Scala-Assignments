object MyApp extends App{
var Ac1 = new Account("971701617V",20200729, 15000.15)
var Ac2 = new Account("971701617V",20200729, 0)

Ac1.Transfer(Ac2,1000)
println(Ac1)
println(Ac2)
}
class Account(id:String, n: Int, b: Double){
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b
  override def toString ="["+nic+":"+acnumber +":"+ balance+"]"

  def withdraw(amount:Double)={
          this.balance=this.balance-amount
          if (this.balance<0) println("Balance is insufficient")
      }

      def deposit(amount:Double) = this.balance=this.balance+amount

  def Transfer(Ac:Account,amount:Double)={
        this.balance=this.balance-amount
        Ac.balance=Ac.balance+amount
        if (this.balance<0) println("Balance is insufficient")
    }
}
