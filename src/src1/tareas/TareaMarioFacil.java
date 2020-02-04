package src1.tareas;

import libs.Input;

public class TareaMarioFacil {

	private static int altura;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Cuanto mide la piramide?");
		altura = Input.get_int();
		
		for(int linea=1 ;linea <= altura ; linea++)
		{
			String piramide="";
			for(int character=0;character <= altura; character++)
			{
				int gato = altura-linea;
				if(character >= gato || character == altura)
					piramide += "#";
				else
					piramide += " ";
			}
			System.out.println(piramide);
		}
		
		
	}

}
