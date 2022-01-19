package javaDioProject;

import java.math.BigInteger;
import java.util.Scanner;

public class ExercictandoIfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		mes = 1;
		boolean teste=true;
		if (!teste) {
			System.out.println("Verdade");
		} else if (mes <= 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		}
		// ver se a pessoa está de férias
		String ferias = "Junho";
		if(ferias=="Junho"|| ferias=="Dezembro"||ferias=="Janeiro") {
			System.out.println("Está de férias");
		}
		// agora com Switch
		switch(ferias){
			case "Junho":
			System.out.println("Está de férias");
			break;
		case "Dezembro":
			System.out.println("Está de férias");
			break;
		case "Janeiro":
			System.out.println("Está de férias");
			break;
		default:
			System.out.println("Mês inválido");

		}
		
		int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
		System.out.print(numeros[1][1]);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			double razaoCrescimento=2;
			for(int c=1; c<x;c++) {
				razaoCrescimento= razaoCrescimento*2;
			}
			 long z=  (long) ((razaoCrescimento/12)/1000);
			
			System.out.print(z);   //Complete o código aqui.
		}
	
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			double graos = 2;
			
			for(int j = 1; j < x; j++){
			    graos = graos * 2;
			}
			
			double res = ((graos / 12) / 1000);
			System.out.println((long) res + " kg");   //Complete o código aqui.
		}
        
	}
	

}
