/*
 * Autor: Marcos P�rez
 * Grup 44 - 9.1
 */

package propsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseDriver {
	
	private static void intro() 
	{
		System.out.println("------------------------");
        System.out.println("|    Driver de Base    |");
        System.out.println("------------------------");
	}

	private static void menu()
	{
		System.out.println("Opcions:");
        System.out.println("1) Consultar nom de la base"); 
        System.out.println("2) Consultar el id de la base");
        System.out.println("3) Modificar nom de la base");
        System.out.println("4) Escriure informaci� de la base");
        System.out.println("0) exit");
	}
	
	public static void main(String[] args) throws IOException {
		Capita c = new Capita();
		Base b = new Base("Aargonar",c.getGalaxia());
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        intro();
        menu();
		
        int op = Integer.parseInt(br.readLine());
		
		while (op != 0) {
			switch(op) 
			{
				case 1:
					String nom = b.getNom();
					if (nom != null) System.out.println("El nom de la base es: " + b.getNom());
					else System.out.println("La base no t� cap nom assignat");
					break;
				case 2:
					int id = b.getId();
					System.out.println("El id de la base es: " + Integer.toString(id));
					break;
				case 3:
					System.out.println("Introdueix el nou nom per a la base: ");
					String n = br.readLine();
					b.setNom(n);
					break;
				case 4:
					System.out.println("NOM" +"\t-\t " +"ID");
					System.out.println(b);					
					break;
				default:
					System.out.println("No existeix aquesta opci�");
					break;
			}
			menu();
			op = Integer.parseInt(br.readLine());
		}
	}
}
