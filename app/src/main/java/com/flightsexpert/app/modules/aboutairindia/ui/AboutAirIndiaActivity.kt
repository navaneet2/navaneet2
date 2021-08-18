package com.flightsexpert.app.modules.aboutairindia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityAboutAirIndiaBinding
import com.flightsexpert.app.modules.aboutairindia.`data`.viewmodel.AboutAirIndiaVM
import com.flightsexpert.app.modules.evolutionoflogo.ui.EvolutionOfLogoActivity
import kotlin.String
import kotlin.Unit

public class AboutAirIndiaActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAboutAirIndiaBinding

  private val viewModel: AboutAirIndiaVM by viewModels<AboutAirIndiaVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_about_air_india)
    binding.lifecycleOwner = this
    binding.aboutAirIndiaVM = viewModel
    binding.btnKnowMore.setOnClickListener {

      val destIntent = EvolutionOfLogoActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "ABOUT_AIR_INDIA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutAirIndiaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
