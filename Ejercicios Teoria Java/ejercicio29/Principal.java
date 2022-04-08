package ejercicio29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int col =4;
		int filas = 4;
		int[][] numeros = new int [filas][col];
		JOptionPane.showMessageDialog(null, "Ingrese datos");
		for(int i = 0;i<filas;i++) {
			for(int j = 0;j<col;j++) {
				numeros[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato fila: "+i+" columna: "+j));
			}
		}
		int productoPrincipal=1;
		for(int i=0;i<col;i++) {
			productoPrincipal *=numeros[i][i];
		}
		int productoSecundario=1;
		int j=col-1;
		for(int i=0;i>col;i--) {
			productoSecundario *=numeros[i][j];
			j--;
		}
		JOptionPane.showMessageDialog(null, productoPrincipal*productoSecundario);
		

	}

}
