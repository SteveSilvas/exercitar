import javax.swing.JOptionPane;

public class DiasDeVida {

	public static void main(String[] args) {

  //tratando excess�es com try catch se o formato nao for numerico
		//vai executar o catch q printa mensg d erro
        try {

		int idadeA;
		idadeA = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		int idadeM = idadeA*12;
		int idadeD = idadeA*360;
		int idadeH = idadeD*24;
		int idadeMin = idadeH*60;
		int idadeSeg = idadeMin*60;
		
		
		
		JOptionPane.showMessageDialog(null, "sua idade em Meses �: "+idadeM);
		JOptionPane.showMessageDialog(null, "sua idade em dias �: "+idadeD);
		JOptionPane.showMessageDialog(null, "sua idade em Horas �: "+idadeH);
		JOptionPane.showMessageDialog(null, "sua idade em Minutos �: "+idadeMin);
		JOptionPane.showMessageDialog(null, "sua idade em Segundos �: "+idadeSeg);

    } catch (NumberFormatException e){
        System.out.println("N�mero inv�lido!");
        JOptionPane.showMessageDialog(null, "N�mero inv�lido");
    }
	}

}
