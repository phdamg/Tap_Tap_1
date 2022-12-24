package com.amba.tap_tap.ui.quickpay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.amba.tap_tap.databinding.FragmentQuickpayBinding


class QuickpayFragment : Fragment() {

    private var _binding: FragmentQuickpayBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val quickpayViewModel =
            ViewModelProvider(this).get(QuickpayViewModel::class.java)

        _binding = FragmentQuickpayBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textQuickpay
        quickpayViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}