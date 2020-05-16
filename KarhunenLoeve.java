package mathcomp.oletsky.karhunenloeve;
import Jama.EigenvalueDecomposition;
import Jama.Matrix;

public class KarhunenLoeve {
    public static EigenvalueDecomposition getEigens(double[][] m ) {
        Matrix matr = new Matrix(m);
        return matr.eig();

    }
}
