package com.flightsexpert.app.modules.splashanimate.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivitySplashAnimateBinding
import com.flightsexpert.app.modules.splashanimate.`data`.viewmodel.SplashAnimateVM
import kotlin.String
import kotlin.Unit

public class SplashAnimateActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashAnimateBinding

  private val viewModel: SplashAnimateVM by viewModels<SplashAnimateVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_animate)
    binding.lifecycleOwner = this
    binding.splashAnimateVM = viewModel
    binding.btnGetStarted.setOnClickListener {


    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_ANIMATE_ACTIVITY"
  }
}
