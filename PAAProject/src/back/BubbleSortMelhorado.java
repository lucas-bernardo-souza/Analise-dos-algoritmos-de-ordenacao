package back;

public class BubbleSortMelhorado {
	private int[] vet;
	private int aux = 0;
	private int i , j = 0;
	private boolean estaOrdenado = false;
	
	
	public BubbleSortMelhorado() {
		super();
	}
	
	public int[] ordena(int [] X) {
		this.vet = X;
		
		for(i=0; i < vet.length; i++) {
			estaOrdenado = true;
			for(j = 0; j < vet.length - 1; j++) {
				if(vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
					estaOrdenado = false;
				}
			}
			if(estaOrdenado)
				return vet;
		}
		return vet;
	}
	
}
