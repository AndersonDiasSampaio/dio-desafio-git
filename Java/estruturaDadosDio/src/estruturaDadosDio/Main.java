package estruturaDadosDio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No no1= new No("Conteudo No1");
		No no2= new No("Conteudo No2");
		no1.setProximoNo(no2);
		No no3= new No("Conteudo No3");
		no2.setProximoNo(no3);
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println("-----------------------------");
		System.out.println(no1);
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
	}

}
