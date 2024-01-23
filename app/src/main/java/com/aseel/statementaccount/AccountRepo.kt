package com.aseel.statementaccount

import com.aseel.statementaccount.data.Transaction
import com.aseel.statementaccount.data.TransactionType
class AccountRepo {
    companion object{



        var dummyAccount = listOf(
            Transaction("Aseel",TransactionType.Withdrawl,4300.0,"Channel","2-1-2024")
            ,Transaction("Aseel",TransactionType.Withdrawl,6000.0,"Dior","15-1-2024"),
            Transaction("Aseel",TransactionType.Withdrawl,15000.0,"Rolex","22-1-2024"))

    }
}