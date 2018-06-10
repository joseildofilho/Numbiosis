package ufpb.ci.numbiosis.modules.three.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.amulyakhare.textdrawable.TextDrawable

import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.three.TransitionClickListener

class ModuleThreeFragment : Fragment() {

    val listener = TransitionClickListener(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_module_three, container, false)
        setButtons(view)
        return view
    }

    private fun setButtons(view: View) {
        val icon1 = view.findViewById<ImageButton>(R.id.icon1)
        val icon2 = view.findViewById<ImageButton>(R.id.icon2)
        val icon3 = view.findViewById<ImageButton>(R.id.icon3)
        val icon4 = view.findViewById<ImageButton>(R.id.icon4)

        val title1 = view.findViewById<Button>(R.id.title1)
        val title2 = view.findViewById<Button>(R.id.title2)
        val title3 = view.findViewById<Button>(R.id.title3)
        val title4 = view.findViewById<Button>(R.id.title4)

        icon1.setImageDrawable(TextDrawable.builder()
                .buildRound(title1.text.substring(0, 1), ContextCompat.getColor(context!!, R.color.colorText)))
        icon2.setImageDrawable(TextDrawable.builder()
                .buildRound(title2.text.substring(0, 1), ContextCompat.getColor(context!!, R.color.colorText)))
        icon3.setImageDrawable(TextDrawable.builder()
                .buildRound(title3.text.substring(0, 1), ContextCompat.getColor(context!!, R.color.colorText)))
        icon4.setImageDrawable(TextDrawable.builder()
                .buildRound(title4.text.substring(0, 1), ContextCompat.getColor(context!!, R.color.colorText)))

        icon1.setOnClickListener(listener)
        icon2.setOnClickListener(listener)
        icon3.setOnClickListener(listener)
        icon4.setOnClickListener(listener)

        title1.setOnClickListener(listener)
        title2.setOnClickListener(listener)
        title3.setOnClickListener(listener)
        title4.setOnClickListener(listener)
    }
}
