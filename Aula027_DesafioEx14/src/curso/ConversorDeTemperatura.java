package curso;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		
		//declarar Locale
		Locale.setDefault(Locale.US);
		
		//declarar variáveis
		//obj scanner
		Scanner sc = new Scanner (System.in);
		double celsius, fah;
		
		//entrada de dados 
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = Double.parseDouble(sc.nextLine());
		
		//lógica
		fah = (9 * celsius + 160) / 5;
		
		//saída
		
		if(fah > 45 && fah < 90) {
		System.out.println(fah + "f, temperatura ideal para o experimento");
		}
		else {
			System.out.println(fah + "f, temperatura inapropriada para o experimento");
		
		
	}

}
}








