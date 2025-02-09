package models

import java.time.LocalDateTime

class CashWallet (
    private val id : Int,
    private var name : String,
    private var balance : Double,
    private val createdAt: LocalDateTime = LocalDateTime.now(),
) : VirtualAccount(id = id, name = name, balance, createdAt = createdAt) {

}