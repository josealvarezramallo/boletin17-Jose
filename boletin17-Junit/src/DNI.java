/*
  Crea a clase DNI cos seguintes métodos:
		a. boolean eValido(string numeroLetra)
		b. int calculaLetra(string numero)
		c. boolean eValido (ArrayList<Integer> numeros, char letra)
		d. int calculaLetra(ArrayList<Integer> numeros)
	 */
public class DNI {	
   //boolean eValido(string numeroLetra) 
    public boolean eValido (String dni) {
   // la longitud sea igual a 9	
    		if(dni.length()==9);
    		return true;
    }
    // int calculaLetra(string numero)
    //dni entero y positivo y calcula su letra correspondiente.
     public char calculaLetra(int dni){
    	     char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    	     int resto = dni%23;
    	     return letras[resto]; 
    }	
}	