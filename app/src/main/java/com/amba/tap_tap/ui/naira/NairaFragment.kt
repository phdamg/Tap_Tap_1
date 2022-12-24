package com.amba.tap_tap.ui.naira

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.amba.tap_tap.databinding.FragmentNairaBinding

class NairaFragment : Fragment() {

    private var _binding: FragmentNairaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val nairaViewModel =
            ViewModelProvider(this).get(NairaViewModel::class.java)

        _binding = FragmentNairaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNaira
        nairaViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}