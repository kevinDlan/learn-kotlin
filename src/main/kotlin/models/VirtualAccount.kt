package models

import CashWalletHistoricItem
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

 open class VirtualAccount (
    private val id : Int,
    private var name : String,
    private var balance : Double,
    private val createdAt: LocalDateTime = LocalDateTime.now())
{
    private val accountHistoric: MutableList<CashWalletHistoricItem> = mutableListOf()

    fun makeDeposit(amount : Double) {

        try {
            balance += amount
            val currentDate = LocalDateTime.now()
            setCashWalletHistoric(
                CashWalletHistoricItem(
                    type = "Deposit",
                    amount = amount,
                    balanceAfter = balance,
                    transactionDate = currentDate
                )
            )
        }catch (e: Exception)
        {
            throw  Exception(e.message)
        }
    }

    fun makeWithdraw(amount : Double) {
        if (balance >= amount) {
            balance -= amount
            val currentDate = LocalDateTime.now()
            setCashWalletHistoric(
                CashWalletHistoricItem(
                    type = "Withdraw",
                    amount = amount,
                    balanceAfter = balance,
                    transactionDate = currentDate
                )
            )
        }else
        {
            println("Insufficient balance")
        }
    }

    val getBalance : String get() = "Balance : $balance"

    private fun setCashWalletHistoric(item : CashWalletHistoricItem) {
        accountHistoric.add(item)
    }

    val getName: String get() = name

    fun setName(name: String) {
        this.name = name
    }

    fun historic(){

        if(accountHistoric.size <= 0){
            println("No transactions carried out")
            return
        }
        for (cashWalletHistoricItem in accountHistoric) {
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