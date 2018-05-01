package ufpb.ci.numbiosis.modules

import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.View
import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.one.ModuleOneActivity
import ufpb.ci.numbiosis.modules.three.ModuleThreeActivity
import ufpb.ci.numbiosis.modules.two.ModuleTwoActivity

class MainOnClickListener: View.OnClickListener {
    override fun onClick(v: View?) {
        val activity = when(v!!.id){
            R.id.module1 -> ModuleOneActivity()
            R.id.module2 -> ModuleTwoActivity()
            R.id.module3 -> ModuleThreeActivity()
            R.id.module1Text -> ModuleOneActivity()
            R.id.module2Text -> ModuleTwoActivity()
            R.id.module3Text -> ModuleThreeActivity()
            else -> null
        }
        val intent = Intent(v!!.context, activity!!::class.java)
        ContextCompat.startActivity(v.context, intent, null)
    }
}