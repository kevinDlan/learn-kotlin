import models.CashWallet
import models.VirtualAccount

fun main() {

    val  savingCashWallet: VirtualAccount = CashWallet(id = 100,name= "Savings", balance = 0.0)

    savingCashWallet.getCreatedAtDate
    savingCashWallet.historic()
    println(savingCashWallet.getBalance)
    savingCashWallet.makeDeposit(25000.0)
    savingCashWallet.makeWithdraw(50.0)
    savingCashWallet.makeWithdraw(10.0)
    savingCashWallet.makeWithdraw(1000000.0)
    println(savingCashWallet.getBalance)
    savingCashWallet.historic()

}