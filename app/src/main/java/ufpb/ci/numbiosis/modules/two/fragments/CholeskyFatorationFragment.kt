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
import ufpb.ci.numbiosis.modules.two.methods.CholeskyDecomposition
import ufpb.ci.numbiosis.modules.two.methods.utils.LinearSystemArray
import ufpb.ci.numbiosis.modules.two.methods.utils.Matrix
import ufpb.ci.numbiosis.modules.two.methods.utils.Vector

class CholeskyFatorationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_cholesky_fatoration, container, false)
        setCalculateListener(view)
        return view
    }

    private fun setCalculateListener(view: View){
        val button = view.findViewById<Button>(R.id.calculate_button)
        button.setOnClickListener({
            if(!Utils.validateLinearSystem(view)){
                calculate(view)
            }else{
                Toast.makeText(context, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun calculate(view: View){
        val matrix = Matrix(Utils.getLinearSystemMatrix(view))
        val vector = Vector(Utils.getLinearSystemVector(view))
        val linearSystem = LinearSystemArray(matrix, vector)
        val array = CholeskyDecomposition.run(linearSystem)
        Utils.setMatrixResult(array[0], array[1], view)
    }
}
