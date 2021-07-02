package com.aiden.mycoin.presentation.view.main

import android.view.LayoutInflater
import androidx.activity.viewModels
import com.aiden.mycoin.databinding.ActivityMainBinding
import com.aiden.mycoin.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = { ActivityMainBinding.inflate(it) }

    private val mainViewModel: MainViewModel by viewModels()

    override fun bindViews() {
    }

    override fun initViewModels() {
    }
}