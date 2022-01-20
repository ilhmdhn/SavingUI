package com.ilhmdhn.saving.data

import com.ilhmdhn.saving.model.TransactionModel

object TransactionData {

    private val type= arrayOf(
        "income",
        "income",
        "expenditure",
        "income",
        "expenditure",
        "expenditure",
        "income",
        "expenditure",
        "income",
        "expenditure",
    )

    private val desc = arrayOf(
        "Succes!",
        "Succes!",
        "Starbucks Drinks",
        "Succes!",
        "Payment #Invest",
        "Payment #Invest",
        "Succes!",
        "Starbucks Drinks",
        "Succes!",
        "Starbucks Drinks",
    )

    private val date  = arrayOf(
        "February 10, 12:25 PM",
        "February 11, 11:42 PM",
        "February 12, 11:43 PM",
        "February 13, 12:55 PM",
        "February 14, 15:33 PM",
        "February 15, 04:34 PM",
        "February 16, 10:22 PM",
        "February 17, 9:00 PM",
        "February 18, 7:01 PM",
        "February 19, 8:05 PM",
    )

    private val value = arrayOf(
        "100.000",
        "200.000",
        "200.000",
        "20.000",
        "25.000",
        "11.000",
        "56.500",
        "500.000",
        "250.000",
        "220.000"
    )

    val listTransaction: ArrayList<TransactionModel>
    get() {
        val list = arrayListOf<TransactionModel>()
        for (position in type.indices) {
            val transaction = TransactionModel()
            transaction.type = type[position]
            transaction.desc = desc[position]
            transaction.date = date[position]
            transaction.value = value[position]
            list.add(transaction)
        }
        return list
    }
}