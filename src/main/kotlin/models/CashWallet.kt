import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CashWallet (
    private val id : Int,
    private var name : String,
    private var balance : Double,
    private val createdAt: LocalDateTime = LocalDateTime.now(),
) {

    private val cashWalletHistoric: MutableList<CashWalletHistoricItem> = mutableListOf()



    fun makeDeposit(amount : Double) {
        balance += amount
        val currentDate = LocalDateTime.now()
        setCashWalletHistoric(
            CashWalletHistoricItem(
                type = "Deposit",
                amount = amount,
                balanceAfter =  balance,
                transactionDate =  currentDate
            )
        )
    }

    fun makeWithdraw(amount : Double) {
        if (balance >= amount) {
            balance -= amount
            val currentDate = LocalDateTime.now()
            setCashWalletHistoric(
                CashWalletHistoricItem(
                    type = "Withdraw",
                    amount = amount,
                    balanceAfter =  balance,
                    transactionDate =  currentDate
                )
            )
        }else
        {
            println("Insufficient balance")
        }
    }

    val getBalance : String get() = "Balance : $balance"

    private fun setCashWalletHistoric(item : CashWalletHistoricItem) {
        cashWalletHistoric.add(item)
    }

    val getName: String get() = name

    fun setName(name: String) {
        this.name = name
    }

    fun historic(){

        if(cashWalletHistoric.size <= 0){
            println("No transactions carried out")
            return
        }
        for (cashWalletHistoricItem in cashWalletHistoric) {
            println(
                "Type : ${cashWalletHistoricItem.getType} " +
                        "| Amount : ${cashWalletHistoricItem.getAmount} " +
                        "| Balance After: ${cashWalletHistoricItem.getBalanceAfter} " +
                        "| Transaction Date: ${cashWalletHistoricItem.getTransactionDate}"
            )
        }
    }

    val getCreatedAtDate: String get() = createdAt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))
}