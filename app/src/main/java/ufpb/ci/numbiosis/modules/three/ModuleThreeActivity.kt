package ufpb.ci.numbiosis.modules.two

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import ufpb.ci.numbiosis.R

import kotlinx.android.synthetic.main.activity_module_one.*

class ModuleTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_two)
        setSupportActionBar(toolbar)
    }

}
