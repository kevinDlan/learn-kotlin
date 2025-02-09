import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CashWalletHistoricItem(
    private val type : String,
    private val amount : Double,
    private val balanceAfter : Double,
    private val transactionDate: LocalDateTime
)
{

    val getType : String get() = type
    val getAmount: Double get() = amount
    val getBalanceAfter: Double get() = balanceAfter
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    val getTransactionDate: String get() = transactionDate.format(formatter)
}