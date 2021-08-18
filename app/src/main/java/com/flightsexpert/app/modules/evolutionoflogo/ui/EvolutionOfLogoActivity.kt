package com.flightsexpert.app.modules.evolutionoflogo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityEvolutionOfLogoBinding
import com.flightsexpert.app.modules.evolutionoflogo.`data`.viewmodel.EvolutionOfLogoVM
import com.flightsexpert.app.modules.history1.ui.History1Activity
import kotlin.String
import kotlin.Unit

public class EvolutionOfLogoActivity : AppCompatActivity() {
  private lateinit var binding: ActivityEvolutionOfLogoBinding

  private val viewModel: EvolutionOfLogoVM by viewModels<EvolutionOfLogoVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_evolution_of_logo)
    binding.lifecycleOwner = this
    binding.evolutionOfLogoVM = viewModel
    binding.btnNext.setOnClickListener {

          val destIntent = History1Activity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public companion object {
    public const val TAG: String = "EVOLUTION_OF_LOGO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EvolutionOfLogoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
