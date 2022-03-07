package testandoNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class desafioNumber {
	public static void main(String[] args) {
		
		
			try (Scanner input = new Scanner(System.in)) {
				System.out.print("Valor do produto: ");
				double entradaValor = input.nextDouble();
				
				BigDecimal bg = new BigDecimal(entradaValor);
				bg = bg.multiply(new BigDecimal(0.1));

				DecimalFormat df = new DecimalFormat("R$ #,##0.00"); 
				String valorFormatado =  df.format(bg);
				System.out.println("10% de " + "R$ " + entradaValor + " é " + valorFormatado);
			
				System.out.println("Operação Concluída");
			}catch(InputMismatchException e) {
				System.out.println("Entrada Inválida, por favor coloque apenas números!");
			}
		
	}
}
