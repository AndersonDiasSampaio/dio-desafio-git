package estruturaDadosDio;

public class Pilha  {

private PilhaNo entradaPilha;

public Pilha() {
	this.entradaPilha = null;
}
public boolean isEmpty() {
	if(entradaPilha==null){
		return true;
	}else {
		return false;
	}
}
public PilhaNo top() {
	return entradaPilha;
}
public void push(PilhaNo no) {
	
	PilhaNo aux = no;
	entradaPilha=no;
	entradaPilha.setRefNo(aux);
}
public PilhaNo pop() {
	if(!this.isEmpty()) {
		PilhaNo noPoped= entradaPilha;
		entradaPilha=entradaPilha.getRefNo();
		return noPoped;
	}
	return null;
}
@Override
public String toString() {
	   String stringRetorno = "------------\n";
       stringRetorno += "   Pilha\n";
       stringRetorno += "------------\n";
       PilhaNo noAuxiliar = entradaPilha;
       while(true){
           if(noAuxiliar != null){
               stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
               noAuxiliar = noAuxiliar.getRefNo();
           }else{
               break;
           }
       }
       stringRetorno += "============";
       return stringRetorno;
}

}
