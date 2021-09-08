package etapa2_atv3;


import java.util.ResourceBundle;

public class Util {
 
	private static final ResourceBundle props = ResourceBundle.getBundle("etapa2_atv3.localidade");
	
	public static String getProp(String local) {
      if(props.containsKey(local)) {
    	  return props.getString(local);
      }
      return null;
	}
}