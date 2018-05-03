package ufpb.ci.numbiosis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.amulyakhare.textdrawable.TextDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mainOnClickListener: MainOnClickListener? = MainOnClickListener(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButtons()
    }

    private fun setButtons(){
        module1.setImageDrawable(TextDrawable.builder()
                .buildRound("I", ContextCompat.getColor(applicationContext, R.color.colorText)))
        module2.setImageDrawable(TextDrawable.builder()
                .buildRound("II", ContextCompat.getColor(applicationContext, R.color.colorText)))
        module3.setImageDrawable(TextDrawable.builder()
                .buildRound("III", ContextCompat.getColor(applicationContext, R.color.colorText)))

        module1.setOnClickListener(mainOnClickListener)
        module2.setOnClickListener(mainOnClickListener)
        module3.setOnClickListener(mainOnClickListener)
        module1Text.setOnClickListener(mainOnClickListener)
        module2Text.setOnClickListener(mainOnClickListener)
        module3Text.setOnClickListener(mainOnClickListener)
    }
}
