package ejercicio36;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
 int[] numeros= {-2,5,8,-9,10,15,-4};;
int sum1=0; int  sum2=0;

for(int i=0; i<7;i++) {
	if(numeros[i]<0) {
		sum2=sum2+numeros[i];
	}
	else {
	sum1=sum1+numeros[i];
	}
}
	JOptionPane.showMessageDialog(null,"La suma de negativos es: "+sum2+" y la de positivos: "+sum1);
	}

}
