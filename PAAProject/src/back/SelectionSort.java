package back;

public class SelectionSort {
	private int[] vet;
	private int eleito = 0;
	private int menor = 0;
	private int pos = 0;
	
	public SelectionSort() {
		super();
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		int i, j;
		for(i=0; i < vet.length-1;i++) {
			eleito = vet[i];
			menor = vet[i+1];
			pos = i+1;
			for(j=i+2; j<vet.length;j++) {
				if(vet[j] < menor) {
					menor = vet[j];
					pos = j;
				}
			}
			if(menor < eleito) {
				vet[i] = vet[pos];
				vet[pos] = eleito;
			}
		}
		return vet;
	}
	
}
