package ufpb.ci.numbiosis.modules.three.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.three.methods.MidpointMethod


class MidpointMethodFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_midpoint_method, container, false)
        val button = view.findViewById<Button>(R.id.calculate_button)
        button.setOnClickListener {
            calculate(view)
        }
        return view
    }

    private fun calculate(view: View){
        val function = view.findViewById<EditText>(R.id.f_value).text.toString()
        val initial = view.findViewById<EditText>(R.id.yi_value).text.toString().toDouble()
        val h = view.findViewById<EditText>(R.id.h_value).text.toString().toDouble()
        val n = view.findViewById<EditText>(R.id.n_value).text.toString().toInt()

        val result = MidpointMethod.run(function, initial, h, n)
        val iterations = view.findViewById<TextView>(R.id.iterations)

        for(i in result){
            iterations.text = iterations.text.toString() + i + "\n"
        }
    }
}
