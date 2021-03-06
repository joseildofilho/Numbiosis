package ufpb.ci.numbiosis.modules.two.methods.utils;

public interface LinearSystem {
    void isolateMainDiagonal();

    double applyInLine(Vector vector, int line, int relativeTo);

    void subtractLineBy(Vector vector, int line);

    void multiplyLineBy(double scalar, int line);

    int getEquationsSize();

    double get(int k, int k1);

    void set(double value, int i, int j);

    Vector getLine(int line);

    void subtractLineFromLine(int i, int k);

    public Vector getVector();
}
