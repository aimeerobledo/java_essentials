package src1.tareas;

import libs.Input;

public class TareaBotellasAgua {

		public static void main(String[] args) {
			
			{
			   
			   System.out.print("Cuantos minutos duaras en la ducha?");
			   int Minutos = Input.get_int();
			   int Botellas = Input.get_int();
			   System.out.print("Botellas de agua usada: " + (Botellas * Minutos));
			   
			    
			    
			}

		}

	}
