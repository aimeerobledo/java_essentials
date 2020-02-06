package src2.tareas;

import libs.Input;

public class InicialesFaciles {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Escribe tu nombre");
		
		String s = Input.get_string();
		String Palabras[]= s.split(" ");
	    if (s != null && Palabras.length >0)
	    {
	        for (int i = 0, n = Palabras.length - 1; i <= n ;i++) 
	        	
	        {
	            if (Palabras[i].charAt(0) >= 'A' && Palabras[i].charAt(0) <= 'Z')
	            {
	                Input.print((char) (Palabras[i].charAt(0)));
	               
	             }
	        }
	       
	    }
	}

}
