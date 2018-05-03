package ufpb.ci.numbiosis.modules.two

import android.view.View
import android.widget.Toast
import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.two.fragments.*

class TransitionClickListener(val moduleTwoFragment: ModuleTwoFragment): View.OnClickListener {
    override fun onClick(v: View?) {
        val fragment = when(v!!.id){
            R.id.icon1 -> GaussEliminationFragment()
            R.id.title1 -> GaussEliminationFragment()
            R.id.icon2 -> LUFatorationFragment()
            R.id.title2 -> LUFatorationFragment()
            R.id.icon3 -> CholeskyFatorationFragment()
            R.id.title3 -> CholeskyFatorationFragment()
            R.id.icon4 -> JacobiMethodFragment()
            R.id.title4 -> JacobiMethodFragment()
            R.id.icon5 -> GaussSeidelMethodFragment()
            R.id.title5 -> GaussSeidelMethodFragment()
            else -> null
        }
        moduleTwoFragment.fragmentManager!!.beginTransaction()
                .replace(R.id.fragment_layout, fragment)
                .addToBackStack(null)
                .commit()
    }
}