package javaDioProject;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1=true, b2=false;
		boolean b3=true, b4=true;

		if(b1&&b2==true) {
			System.out.println("ambos são verdadeiros");
		}else if(b1||b2==true) {
			System.out.println("existe ao menos um verdadeiro ||");
		}
		else if(b1^b2) {
			System.out.println("existe ao menos um verdadeiro ^");
		}
		
		if(b3&&b4==true) {
			System.out.println("ambos são verdadeiros");
		}else if(b3||b4==true) {
			System.out.println("existe ao menos um verdadeiro");
		}
		else if(b3^b4) {
			System.out.println("existe ao menos um verdadeiro");
		}
	}

}
