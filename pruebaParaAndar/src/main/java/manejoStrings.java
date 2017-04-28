
public class manejoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mi_string = "fotosintético";//Sintax Sugar: Instanciación String
		
		System.out.println("Mi string es "+mi_string+" y tiene "+mi_string.length()+" letras."
				+" Su primer letra es "+mi_string.charAt(0)+" y su ultima letra es "+
				mi_string.charAt(mi_string.length()-1)+"."); //charAt empieza a contar desde la posicion 0.
		
		System.out.println("Contiene la palabra "+ mi_string.substring(4,13)+".");
		// la palabra comienza en LA POSICION MARCADA EN IndexBegin y FINALIZA una posición antes de IndexEnd
	}

}
