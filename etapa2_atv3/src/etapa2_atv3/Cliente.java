package etapa2_atv3;

import java.io.IOException;

public class Cliente {
	
    public static void main(String[] args) throws IOException {
        LocalidadeFactory factory = new LocalidadeFactory();
        LocalidadeAbstractFactory localidade = factory.newLocalidade();

        System.out.println("Data " + localidade.getData(3, 9, 2021));
        System.out.println("Moeda " + localidade.getMoeda(6));
    }
}
