import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, ArrayList<String>> mapIngresos = new HashMap<String, ArrayList<String>>();
	int mayorEdad = 0;
	int menorEdad = 0;
	
	public void ingresoPersonas() {
		ArrayList<String> listEdades = new ArrayList<String>();
		String doc = null;
		String nombre = null;
		String profesion = null;
		int edad = 0;
		int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas va a ingresar")); 
		for (int i = 0; i < cantPersonas; i++) {
			doc = JOptionPane.showInputDialog("Ingrese el documento de la persona a registrar");
			nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona a registrar");
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
			profesion = JOptionPane.showInputDialog("Ingrese la profesion correspondida a la persona");
			listEdades.add(nombre);
			listEdades.add(profesion);
			listEdades.add(edad+"");
			
			mapIngresos.put(doc,listEdades);
			analizarEdad(edad);
		}
		System.out.println("El total de personas registradas fue "+ cantPersonas);
		System.out.println("Las personas mayores de edad son "+ mayorEdad);
		System.out.println("Las personas menores de edad son "+menorEdad);
	}
	
	public void analizarEdad(int edad) {
		if (edad >= 18 ) {
			mayorEdad++;
		}
		else {
			menorEdad++;
		}
		
	}
}
