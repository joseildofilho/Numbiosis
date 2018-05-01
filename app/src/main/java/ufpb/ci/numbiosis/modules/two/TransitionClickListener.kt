package ufpb.ci.numbiosis.modules.two.listeners

import android.view.View
import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.two.fragments.GaussEliminationFragment
import ufpb.ci.numbiosis.modules.two.fragments.ModuleTwoFragment

class TransitionClickListener(moduleTwoFragment: ModuleTwoFragment): View.OnClickListener {
    private val ft = moduleTwoFragment.fragmentManager!!.beginTransaction()
    override fun onClick(v: View?) {
        val fragment = when(v!!.id){
            R.id.icon1 -> GaussEliminationFragment()
            R.id.title1 -> GaussEliminationFragment()
            else -> null
        }
        ft.replace(R.id.fragment_layout, fragment)
        ft.commit()
        ft.addToBackStack(null)
    }
}