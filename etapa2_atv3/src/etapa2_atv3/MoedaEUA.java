package etapa2_atv3;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaEUA extends Moeda {
    public MoedaEUA(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return ("Americana: " + nf.format(super.valor));
    }
}

