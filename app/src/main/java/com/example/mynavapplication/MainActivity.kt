package com.example.mynavapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mynavapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        // 액션바 세팅
        val navController = binding.frgNav.getFragment<NavHostFragment>().navController
        setupActionBarWithNavController(navController)
        setContentView(binding.root)

    }

    //업버튼 반응 설정
    override fun onSupportNavigateUp(): Boolean {
        val navController = binding.frgNav.getFragment<NavHostFragment>().navController
        return navController.navigateUp() || super.onSupportNavigateUp()

    }
}