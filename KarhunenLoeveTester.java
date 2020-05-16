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
        double[][] matr = {
                {0.75, 0., 0.},
                {0., 0., 0.},
                {0., 0., 0.25}
        };
        EigenvalueDecomposition eig = KarhunenLoeve.getEigens(matr);

        System.out.println("Eigen matrix:");
        double[][] eigM1=eig.getV().getArray();
        VectMatr.defaultOutputMatrix(eigM1);
        System.out.println("Eigen vector:");
        double[] eigVals=eig.getRealEigenvalues();
        VectMatr.defaultOutputVector(eigVals);
    }
}