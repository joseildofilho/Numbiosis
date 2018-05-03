package ufpb.ci.numbiosis.modules.two.methods;

import ufpb.ci.numbiosis.modules.two.methods.utils.LinearSystem;
import ufpb.ci.numbiosis.modules.two.methods.utils.Matrix;

public class CholeskyDecomposition {

    public static Matrix[] run(LinearSystem ls) {
        double[][] G = new double[ls.getEquationsSize()][ls.getEquationsSize()];
        double[][] Gt = new double[G[0].length][G[0].length];
        double sum;
        for(int i = 0; i < ls.getEquationsSize(); i++) {
            for(int j = 0; j < i + 1; j++) {
                if (i > j) {
                    sum = 0;
                    for (int k = 0; k < j; k++) {
                        sum += G[i][k] * G[j][k];
                    }

                    G[i][j] = (1/G[j][j])*(ls.get(i, j) - sum);
                } else {
                    sum = 0;
                    for (int k = 0; k < j; k++) {
                        sum += Math.pow(G[j][k], 2);
                    }

                    G[j][j] = Math.sqrt(ls.get(j, j) - sum);
                }

            }
        }
        for (int i = 0; i < G[0].length; i++){
            for(int j = 0; j < G[0].length; j++){
                Gt[i][j] = G[j][i];
            }
        }

        Matrix[] matrix = new Matrix[2];
        matrix[1] = new Matrix(G);
        matrix[2] = new Matrix(Gt);

        return matrix;
    }
}