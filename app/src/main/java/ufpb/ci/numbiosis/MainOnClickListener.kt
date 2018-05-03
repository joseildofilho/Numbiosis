package ufpb.ci.numbiosis

import android.content.Intent
import android.view.View
import ufpb.ci.numbiosis.modules.one.ModuleOneActivity
import ufpb.ci.numbiosis.modules.three.ModuleThreeActivity
import ufpb.ci.numbiosis.modules.two.ModuleTwoActivity

class MainOnClickListener(var mainActivity: MainActivity): View.OnClickListener {
    override fun onClick(v: View?) {
        val activity = when(v!!.id){
            R.id.module1 -> ModuleOneActivity()
            R.id.module2 -> ModuleTwoActivity()
            R.id.module3 -> ModuleThreeActivity()
            R.id.module1Text -> ModuleOneActivity()
            R.id.module2Text -> ModuleTwoActivity()
            R.id.module3Text -> ModuleThreeActivity()
            else -> null
        } ?: return
        mainActivity.mainOnClickListener = null
        val intent = Intent(mainActivity, activity::class.java)
        mainActivity.startActivity(intent)
    }
}