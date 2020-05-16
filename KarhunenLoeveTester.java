package mathcomp.oletsky.karhunenloeve;

import Jama.EigenvalueDecomposition;
import mathcomp.oletsky.mathhelper.VectMatr;

/**
 * @author O.Oletsky
 * Principal components algorithm
 * and Karhunen-Loeve expansion
 * (under construction)
 */

public class KarhunenLoeveTester {
    public static void main(String[] args) {
        double[][] mm = {
                {1., 2.},
                {1., 2.}
        };

        double[][] trans = VectMatr.transposeMatrix(mm);
        double[][] matr = VectMatr.multiplyMatrices(trans,mm);
        System.out.println("Result matrix:");
        VectMatr.defaultOutputMatrix(matr);
        System.out.println("------------------");

        EigenvalueDecomposition eig = KarhunenLoeve.getEigens(matr);

        System.out.println("Eigen matrix:");
        double[][] eigM1=eig.getV().getArray();
        VectMatr.defaultOutputMatrix(eigM1);
        System.out.println("Eigen values:");
        double[] eigVals=eig.getRealEigenvalues();
        VectMatr.defaultOutputVector(eigVals);
    }
}