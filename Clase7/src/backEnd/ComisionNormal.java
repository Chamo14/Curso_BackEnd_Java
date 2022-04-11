package backEnd;

public class ComisionNormal implements ComissionStrategy{
    @Override
    public double aplicarComision(double monto) {
        return monto*0.30;
    }

    @Override
    public int verificarComision() {
        return 1;
    }
}
