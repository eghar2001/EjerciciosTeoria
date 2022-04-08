import javax.swing.JOptionPane;

public class Ej37 {

	public static void main(String[] args) {
	int [][] numeros= {{25,33,67},{12,91,43},{67,8,76}};
int max;
	max=numeros[0][0];
	for (int i=0; i<numeros.length;i++) {
		for(int j=0;j<numeros.length;j++) {
			if(numeros[i][j]>max) {
				max=numeros[i][j];
			}
		}
	}
	JOptionPane.showMessageDialog(null,"El valor max: "+max);
	}

}
