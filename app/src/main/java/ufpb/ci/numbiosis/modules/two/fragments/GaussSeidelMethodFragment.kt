package ufpb.ci.numbiosis.modules.two.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import ufpb.ci.numbiosis.R

class GaussEliminationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_gauss_elimination, container, false)
        setCalculateListener(view)
        return view
    }

    private fun setCalculateListener(view: View){
        val button = view.findViewById<Button>(R.id.calculate_button)
        button.setOnClickListener({
            if(!invalidSystem(view)){
                //Solve linear system and append it in R.id.result_text
            }else{
                Toast.makeText(context, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun invalidSystem(view: View): Boolean {
        return view.findViewById<EditText>(R.id.x_value).text.isEmpty() or
                view.findViewById<EditText>(R.id.x_value2).text.isEmpty() or
                view.findViewById<EditText>(R.id.x_value3).text.isEmpty() or
                view.findViewById<EditText>(R.id.y_value).text.isEmpty() or
                view.findViewById<EditText>(R.id.y_value2).text.isEmpty() or
                view.findViewById<EditText>(R.id.y_value3).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value2).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value3).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value2).text.isEmpty() or
                view.findViewById<EditText>(R.id.z_value3).text.isEmpty() or
                view.findViewById<EditText>(R.id.w_value).text.isEmpty() or
                view.findViewById<EditText>(R.id.w_value2).text.isEmpty() or
                view.findViewById<EditText>(R.id.w_value3).text.isEmpty()
    }
}
