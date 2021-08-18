package com.flightsexpert.app.modules.history1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityHistory1Binding
import com.flightsexpert.app.modules.history1.`data`.viewmodel.History1VM
import kotlin.String
import kotlin.Unit

public class History1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityHistory1Binding

  private val viewModel: History1VM by viewModels<History1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_history_1)
    binding.lifecycleOwner = this
    binding.history1VM = viewModel
    binding.btnNext.setOnClickListener {


        }
  }

  public companion object {
    public const val TAG: String = "HISTORY1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, History1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
