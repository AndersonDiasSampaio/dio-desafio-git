package estruturaDadosDio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No<String> no1= new No<String>("Conteudo No1");
		No<String> no2= new No<String>("Conteudo No2");
		no1.setProximoNo(no2);
		No<String> no3= new No<String>("Conteudo No3");
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
