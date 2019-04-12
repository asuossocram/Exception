package aula;

import javax.swing.JOptionPane;

public class projetoaula {

	public static void main(String[]args) {
		
		try {
			String x = JOptionPane.showInputDialog("Digite um número: ");
			//int j = 0;
			int j = Integer.parseInt(x);
			
			while(j < 10) {
			System.out.println(j);
			j = j + 1;
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
