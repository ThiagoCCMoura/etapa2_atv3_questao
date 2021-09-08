package etapa2_atv3;

public class LocalidadeBrasil extends LocalidadeAbstractFactory {
    @Override
    public Data getData(int dia, int mes, int ano) {
        return new DataBrasil(dia, mes, ano);
    }

    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaBrasil(valor);
    }
}
