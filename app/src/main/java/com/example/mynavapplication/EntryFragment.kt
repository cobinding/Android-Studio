package com.example.mynavapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavapplication.databinding.FragmentEntryBinding


class EntryFragment : Fragment() {

    var binding: FragmentEntryBinding? = null

    override fun onCreateView( //말 그대로 view 생성 부분
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentEntryBinding.inflate(inflater)

      return binding?.root
    }

    // binding되고 나서 불리는 함수
    // 버튼 눌리서 어떻게 할지 설정한는 부분
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnAbout?.setOnClickListener {
            findNavController().navigate(R.id.action_entryFragment_to_aboutFragment)
        }
        binding?.btnExamine?.setOnClickListener {
            findNavController().navigate(R.id.action_entryFragment_to_examineFragment)
        }
        binding?.btnSettings?.setOnClickListener {
            findNavController().navigate(R.id.action_entryFragment_to_settingsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}