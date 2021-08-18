package com.flightsexpert.app.modules.loginanimate3.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityLoginAnimate3Binding
import com.flightsexpert.app.modules.loginanimate3.`data`.viewmodel.LoginAnimate3VM
import kotlin.String
import kotlin.Unit

public class LoginAnimate3Activity : AppCompatActivity() {
  private lateinit var binding: ActivityLoginAnimate3Binding

  private val viewModel: LoginAnimate3VM by viewModels<LoginAnimate3VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_login_animate_3)
    binding.lifecycleOwner = this
    binding.loginAnimate3VM = viewModel
    binding.btnLogin.setOnClickListener {


    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ANIMATE3ACTIVITY"
  }
}
