package ufpb.ci.numbiosis.modules.three

import android.view.View
import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.three.fragments.*

class TransitionClickListener(val moduleThreeFragment: ModuleThreeFragment): View.OnClickListener {
    override fun onClick(v: View?) {
        val fragment = when(v!!.id){
            R.id.icon1 -> NewtonInterpolationFragment()
            R.id.title1 -> NewtonInterpolationFragment()
            //R.id.icon2 -> LUFatorationFragment()
            //R.id.title2 -> LUFatorationFragment()
            R.id.icon3 -> HeunsMethodFragment()
            R.id.title3 -> HeunsMethodFragment()
            R.id.icon4 -> MidpointMethodFragment()
            R.id.title4 -> MidpointMethodFragment()
            else -> null
        }
        moduleThreeFragment.fragmentManager!!.beginTransaction()
                .replace(R.id.fragment_layout, fragment)
                .addToBackStack(null)
                .commit()
    }
}