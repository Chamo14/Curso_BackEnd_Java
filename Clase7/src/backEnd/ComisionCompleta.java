package backEnd;

public class ComisionCompleta implements ComissionStrategy{
    @Override
    public double aplicarComision(double monto) {
        return monto*0.80;
    }

    @Override
    public int verificarComision() {
        return 3;
    }
}
