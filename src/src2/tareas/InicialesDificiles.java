package src2.tareas;

import libs.Input;

public class InicialesDificiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Escribe tu nombre");
		
		String s = Input.get_string();
		String palabras[]= s.split(" ");
	    if (s != null && palabras.length >0)
	    {
	        for (int i = 0, n = palabras.length - 1; i <= n ;i++) 
	        	
	        {
	            if (palabras[i].charAt(0) >= 'A' && palabras[i].charAt(0) <= 'Z')
	            {
	                Input.print((char) (palabras[i].charAt(0)));
	               
	             }
	        }
	       
	    }
	}

}


