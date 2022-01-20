package estruturaDadosDio;

public class PilhaNo {
	
	    private int dado;
	    private PilhaNo refNo = null;

	    public PilhaNo() {
	    }

	    public PilhaNo(int dado) {
	        this.dado = dado;
	    }

	    public int getDado() {
	        return dado;
	    }

	    public void setDado(int dado) {
	        this.dado = dado;
	    }

	    public PilhaNo getRefNo() {
	        return refNo;
	    }

	    public void setRefNo(PilhaNo refNo) {
	        this.refNo = refNo;
	    }

	    @Override
	    public String toString() {
	        return "No{" +
	                "dado=" + dado +
	                '}';
	    }
	}

