package etapa2_atv3;



public class LocalidadeFactory {
    public LocalidadeAbstractFactory newLocalidade(){
    	
    	//Informe o país: "Brasil" ou "EUA"
		String pais = Util.getProp("Brasil");	

        if (pais.equals("Brasil")) {
            return new LocalidadeBrasil();
        }else if(pais.equals("EUA")){
        	return new LocalidadeEUA();
        }
        
        return null;
    }
}