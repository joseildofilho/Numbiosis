package ufpb.ci.numbiosis.modules.three

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ufpb.ci.numbiosis.R

import kotlinx.android.synthetic.main.activity_module_three.*
import ufpb.ci.numbiosis.modules.three.fragments.ModuleThreeFragment

class ModuleThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_three)
        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_layout, ModuleThreeFragment())
                .commit()
    }
    companion object {
        fun newInstance(): ModuleThreeActivity {
            return ModuleThreeActivity()
        }
    }
}
