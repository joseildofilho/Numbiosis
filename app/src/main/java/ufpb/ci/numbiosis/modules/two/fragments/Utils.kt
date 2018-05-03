package ufpb.ci.numbiosis.modules.two.fragments

import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import ufpb.ci.numbiosis.R
import ufpb.ci.numbiosis.modules.two.methods.utils.LinearSystemArray
import ufpb.ci.numbiosis.modules.two.methods.utils.Matrix
import ufpb.ci.numbiosis.modules.two.methods.utils.Vector

class Utils {
    companion object {
        fun getLinearSystemMatrix(view: View): Array<DoubleArray> {
            val matrixArray = Array(3, { DoubleArray(3) })
            matrixArray[0][0] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.x_value).text.toString())
            matrixArray[1][0] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.x_value2).text.toString())
            matrixArray[2][0] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.x_value3).text.toString())
            matrixArray[0][1] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.y_value).text.toString())
            matrixArray[1][1] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.y_value2).text.toString())
            matrixArray[2][1] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.y_value3).text.toString())
            matrixArray[0][2] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.z_value).text.toString())
            matrixArray[1][2] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.z_value2).text.toString())
            matrixArray[2][2] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.z_value3).text.toString())
            return matrixArray
        }

        fun getLinearSystemVector(view: View): DoubleArray {
            val vectorArray = DoubleArray(3)
            vectorArray[0] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.w_value).text.toString())
            vectorArray[1] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.w_value2).text.toString())
            vectorArray[2] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.w_value3).text.toString())
            return vectorArray
        }

        fun getStartVector(view: View): DoubleArray{
            val vectorArray = DoubleArray(3)
            vectorArray[0] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.v1_value).text.toString())
            vectorArray[1] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.v2_value).text.toString())
            vectorArray[2] = java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.v3_value).text.toString())
            return vectorArray
        }

        fun getTolerance(view: View): Double{
            return java.lang.Double.parseDouble(view.findViewById<EditText>(R.id.tolerance_text).text.toString())
        }

        fun getIterations(view: View): Int{
            return java.lang.Integer.parseInt(view.findViewById<EditText>(R.id.iterations_text).text.toString())
        }

        fun validateLinearSystem(view: View): Boolean {
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

        fun validateStartData(view: View): Boolean {
            return view.findViewById<EditText>(R.id.v1_value).text.isEmpty() or
                    view.findViewById<EditText>(R.id.v2_value).text.isEmpty() or
                    view.findViewById<EditText>(R.id.v3_value).text.isEmpty() or
                    view.findViewById<EditText>(R.id.tolerance_text).text.isEmpty() or
                    view.findViewById<EditText>(R.id.iterations_text).text.isEmpty()
        }

        fun setMatrixResult(matrix1: LinearSystemArray, matrix2: Matrix, view: View){
            view.findViewById<TextView>(R.id.x1_text).text = matrix1.get(0, 0).toString()
            view.findViewById<TextView>(R.id.x1_text2).text = matrix1.get(1, 0).toString()
            view.findViewById<TextView>(R.id.x1_text3).text = matrix1.get(2, 0).toString()
            view.findViewById<TextView>(R.id.y1_text).text = matrix1.get(0, 1).toString()
            view.findViewById<TextView>(R.id.y1_text2).text = matrix1.get(1, 1).toString()
            view.findViewById<TextView>(R.id.y1_text3).text = matrix1.get(2, 1).toString()
            view.findViewById<TextView>(R.id.z1_text).text = matrix1.get(0, 2).toString()
            view.findViewById<TextView>(R.id.z1_text2).text = matrix1.get(1, 2).toString()
            view.findViewById<TextView>(R.id.z1_text3).text = matrix1.get(2, 2).toString()

            view.findViewById<TextView>(R.id.x2_text).text = matrix2.get(0, 0).toString()
            view.findViewById<TextView>(R.id.x2_text2).text = matrix2.get(1, 0).toString()
            view.findViewById<TextView>(R.id.x2_text3).text = matrix2.get(2, 0).toString()
            view.findViewById<TextView>(R.id.y2_text).text = matrix2.get(0, 1).toString()
            view.findViewById<TextView>(R.id.y2_text2).text = matrix2.get(1, 1).toString()
            view.findViewById<TextView>(R.id.y2_text3).text = matrix2.get(2, 1).toString()
            view.findViewById<TextView>(R.id.z2_text).text = matrix2.get(0, 2).toString()
            view.findViewById<TextView>(R.id.z2_text2).text = matrix2.get(1, 2).toString()
            view.findViewById<TextView>(R.id.z2_text3).text = matrix2.get(2, 2).toString()

            view.findViewById<LinearLayout>(R.id.result_matrix).visibility = View.VISIBLE
        }

        fun setMatrixResult(matrix1: Matrix, matrix2: Matrix, view: View){
            view.findViewById<TextView>(R.id.x1_text).text = matrix1.get(0, 0).toString()
            view.findViewById<TextView>(R.id.x1_text2).text = matrix1.get(1, 0).toString()
            view.findViewById<TextView>(R.id.x1_text3).text = matrix1.get(2, 0).toString()
            view.findViewById<TextView>(R.id.y1_text).text = matrix1.get(0, 1).toString()
            view.findViewById<TextView>(R.id.y1_text2).text = matrix1.get(1, 1).toString()
            view.findViewById<TextView>(R.id.y1_text3).text = matrix1.get(2, 1).toString()
            view.findViewById<TextView>(R.id.z1_text).text = matrix1.get(0, 2).toString()
            view.findViewById<TextView>(R.id.z1_text2).text = matrix1.get(1, 2).toString()
            view.findViewById<TextView>(R.id.z1_text3).text = matrix1.get(2, 2).toString()

            view.findViewById<TextView>(R.id.x2_text).text = matrix2.get(0, 0).toString()
            view.findViewById<TextView>(R.id.x2_text2).text = matrix2.get(1, 0).toString()
            view.findViewById<TextView>(R.id.x2_text3).text = matrix2.get(2, 0).toString()
            view.findViewById<TextView>(R.id.y2_text).text = matrix2.get(0, 1).toString()
            view.findViewById<TextView>(R.id.y2_text2).text = matrix2.get(1, 1).toString()
            view.findViewById<TextView>(R.id.y2_text3).text = matrix2.get(2, 1).toString()
            view.findViewById<TextView>(R.id.z2_text).text = matrix2.get(0, 2).toString()
            view.findViewById<TextView>(R.id.z2_text2).text = matrix2.get(1, 2).toString()
            view.findViewById<TextView>(R.id.z2_text3).text = matrix2.get(2, 2).toString()

            view.findViewById<LinearLayout>(R.id.result_matrix).visibility = View.VISIBLE
        }

        fun setResult(vector: Vector, view: View){
            view.findViewById<TextView>(R.id.result_x).text = vector.get(0).toString()
            view.findViewById<TextView>(R.id.result_y).text = vector.get(1).toString()
            view.findViewById<TextView>(R.id.result_z).text = vector.get(2).toString()

            view.findViewById<LinearLayout>(R.id.result).visibility = View.VISIBLE
        }
    }
}
