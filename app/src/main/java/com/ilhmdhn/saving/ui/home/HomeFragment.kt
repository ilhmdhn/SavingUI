package com.ilhmdhn.saving.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ilhmdhn.saving.R
import com.ilhmdhn.saving.data.TransactionData
import com.ilhmdhn.saving.databinding.FragmentHomeBinding
import com.ilhmdhn.saving.model.TransactionModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private var listTransaction: ArrayList<TransactionModel> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvTransaction?.setHasFixedSize(true)
        listTransaction.addAll(TransactionData.listTransaction)

        binding?.rvTransaction?.layoutManager = LinearLayoutManager(activity)
        val transactionAdapter = TransactionAdapter(listTransaction)
        binding?.rvTransaction?.adapter = transactionAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}