package omplirnumeros;

public class Main {
	
	public static void main(String[] args) {
		int n=5;
		int[] taula = new int[n];
		
		taula = omplir(n);
		int suma = sumar(taula);
		
		System.out.println("La suma és: " + suma);

	}
	
	
	private static int[] omplir(int n) {
		
		int[] taula;
		
		taula = new int[n];
		
		for (int i = 0; i < n; i++)
			taula[i] = i+i+1;
		
		return taula; 
	}
	
	
	private static int sumar(int[] taula) {
	
		int suma = 0;
		
		for (int i = 0; i < taula.length; i++)
			suma = suma + taula[i];
		
		return suma;
	}
	
}
