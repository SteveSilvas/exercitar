import java.util.Scanner;

import javax.swing.JOptionPane;

public class exUm {

	public static void main(String[] args) {
		
		double um[] = new double[3];
		double ler;
				System.out.println("Este programa executa a soma de 3 n�meros e calcula a m�dia.");
		
				for (int i =0;i<3;i++) {
			
					System.out.println("Digite um n�mero");
					int j=i+1;
					 ler = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui seu  numero "+ j));

					//Scanner leri = new Scanner(System.in);
			
					//atribuindo o texto do scanner � var array leri e transformada em double
					um [i] = ler;
					//.nextDouble();
			
				}
		
		double num = um[1] + um[2]+um[0];
		double media = num/3;
		
		System.out.println("Soma dos n�meros = " + num);
		System.out.println("A m�dia entre eles �: "+media);
		
		
	}

}
