FITXER EXTREMADAMENT CANVIAT...!


	private static int[] omplir(int n) {

		int[] taula;

		taula = new int[n];

		for (int i = 0; i < n; i++)
			taula[i] = i+i+2;

		return taula;
	}


	private static int sumar(int[] taula) {

		int suma = 0;

		for (int i = 0; i < taula.length; i++)
			suma = suma + taula[i];

		return suma;
	}

}
