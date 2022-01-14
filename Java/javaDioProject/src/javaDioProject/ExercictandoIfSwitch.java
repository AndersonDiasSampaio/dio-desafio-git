package javaDioProject;

public class ExercictandoIfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		mes = 1;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
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
		}
	}
	

}
