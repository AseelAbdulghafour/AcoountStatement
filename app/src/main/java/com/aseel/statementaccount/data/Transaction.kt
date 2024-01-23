package com.aseel.statementaccount.data


    data class Transaction(var name:String,
                           val transactionType:TransactionType,
                           var Amount:Double,
                           var detail:String
                           ,var Date:String){
    }

