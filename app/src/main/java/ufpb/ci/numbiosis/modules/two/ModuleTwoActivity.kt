package ufpb.ci.numbiosis.modules.two

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ufpb.ci.numbiosis.R

import kotlinx.android.synthetic.main.activity_module_two.*
import ufpb.ci.numbiosis.modules.two.fragments.ModuleTwoFragment

class ModuleTwoActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_two)
        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_layout, ModuleTwoFragment())
                .commit()
    }
    companion object {
        fun newInstance(): ModuleTwoActivity {
            return ModuleTwoActivity()
        }
    }
}
