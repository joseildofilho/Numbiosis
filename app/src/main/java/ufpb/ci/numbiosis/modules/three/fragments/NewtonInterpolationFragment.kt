package ufpb.ci.numbiosis.modules.three.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.anychart.anychart.*
import ufpb.ci.numbiosis.R
import com.anychart.anychart.AnyChart
import com.anychart.anychart.DataEntry
import net.objecthunter.exp4j.ExpressionBuilder
import ufpb.ci.numbiosis.modules.three.methods.NewtonInterpolation
import java.util.*
import kotlin.collections.ArrayList






class NewtonInterpolationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_newton_interpolation, container, false)
        val button = view.findViewById<Button>(R.id.calculate_button)
        button.setOnClickListener {
            calculate(view)
        }
        return view
    }

    fun calculate(view: View){
        val xValues = view.findViewById<EditText>(R.id.x_values).text.toString()
        val yValues = view.findViewById<EditText>(R.id.y_values).text.toString()

        val stringTokenizerX = StringTokenizer(xValues, " ")
        val stringTokenizerY = StringTokenizer(yValues, " ")

        val points = ArrayList<DataEntry>()
        val line = ArrayList<DataEntry>()
        val X = ArrayList<Double>()
        val Y = ArrayList<Double>()
        var xToken: String
        var yToken: String
        while (stringTokenizerX.hasMoreTokens()){
            xToken = stringTokenizerX.nextToken()
            yToken = stringTokenizerY.nextToken()
            X.add(xToken.toDouble())
            Y.add(yToken.toDouble())
            points.add(ValueDataEntry(xToken, yToken.toDouble()))
        }

        val pol = NewtonInterpolation.run(X,Y)
        val exp = ExpressionBuilder(pol).variable("x").build()

        var i = X[0]
        while(i <= X[X.size - 1]){
            exp.setVariable("x", i)
            line.add(ValueDataEntry(i, exp.evaluate()))
            i += 0.05
        }

        val anyChartView = view.findViewById<AnyChartView>(R.id.any_chart_view)
        val expText = view.findViewById<TextView>(R.id.exp)

        val cartesian = AnyChart.line()
        cartesian.setPadding(20.0, 20.0, 10.0, 20.0)
        cartesian.setYGrid(true).setXGrid(true)

        cartesian.setAnimation(true)

        cartesian.line(line)

        anyChartView.setChart(cartesian)
        expText.text = pol
        anyChartView.visibility = View.VISIBLE
    }
}
