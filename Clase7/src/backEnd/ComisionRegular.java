package backEnd;

public class ComisionRegular implements ComissionStrategy{
        @Override
        public double aplicarComision(double monto) {
                return monto*0.15;
        }

        @Override
        public int verificarComision() {
                return 0;
        }
}
