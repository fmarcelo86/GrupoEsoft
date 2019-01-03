public class Convocatoria13122018 {

	public static void calculoMatriz(int columnas, int filas) {
		if (columnas <= 2 || filas <= 2) {
			System.out.println("Tanto las columnas como las filas deben ser mayores a 2");
			return;
		}
		int[][] matriz = new int[columnas][filas];
		int numMaximo = columnas * filas;
		int[] totalColumna = new int[columnas];
		float promColImpar = 0;
		int numColImpar = 0;
		float promColPar = 0;
		int numColPar = 0;
		int numMayorProm = 0;

		for (int i = 0; i < columnas; i++) {
			totalColumna[i] = 0;
			System.out.print("[ ");
			for (int j = 0; j < filas; j++) {
				matriz[i][j] = (int) ((Math.random() * numMaximo) + 1);
				totalColumna[i] += matriz[i][j];
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("]");
		}
		System.out.print("========\n[ ");
		for (int i = 1; i <= columnas; i++) {
			System.out.print(totalColumna[i - 1] + " ");
			if (i % 2 != 0) {
				promColImpar += totalColumna[i - 1];
				numColImpar++;
			} else {
				promColPar += totalColumna[i - 1];
				numColPar++;
			}
		}
		promColImpar = promColImpar / numColImpar;
		promColPar = promColPar / numColPar;

		for (int i = 0; i < columnas; i++) {
			if (totalColumna[i] > promColPar)
				numMayorProm++;
		}
		System.out.println("]\n========");
		System.out.println("Promedio columnas impares = " + promColImpar);
		System.out.println("Cantidad de columnas cuyo total es mayor que " + promColPar + " = " + numMayorProm);
	}

	public static void main(String[] args) {
		calculoMatriz(2, 3);
	}
}
