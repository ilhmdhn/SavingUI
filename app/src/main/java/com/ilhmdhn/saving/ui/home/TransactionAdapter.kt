package com.ilhmdhn.saving.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ilhmdhn.saving.R
import com.ilhmdhn.saving.databinding.HistoryTransactionBinding
import com.ilhmdhn.saving.model.TransactionModel

class TransactionAdapter(private val listTransaction: ArrayList<TransactionModel>):
    RecyclerView.Adapter<TransactionAdapter.ListViewHolder>() {

    class ListViewHolder(val binding: HistoryTransactionBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(transactionModel: TransactionModel){
            binding.icDate.text = transactionModel.date
            binding.tvStatus.text = transactionModel.desc
            if (transactionModel.type == "income"){
                binding.icTransaction.setImageResource(R.drawable.ic_income)
                binding.tvValue.text = "+ ${transactionModel.value}"
            } else{
                binding.icTransaction.setImageResource(R.drawable.ic_expenditure)
                binding.tvValue.text = "- ${transactionModel.value}"
            }

            itemView.setOnClickListener{
                Toast.makeText(itemView.context, "${transactionModel.type} ${transactionModel.value}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val transactionHistoryBinding = HistoryTransactionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(transactionHistoryBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val historyTransaction = listTransaction[position]

        holder.bind(historyTransaction)
    }

    override fun getItemCount(): Int {
        return listTransaction.size
    }
}