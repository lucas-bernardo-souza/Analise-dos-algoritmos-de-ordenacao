package back;

public class InsetionSort {
	private int[] vet;
	int i = 0;
	int j = 0;
	int eleito = 0;
	
	public InsetionSort() {
		super();
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		
		for(i=1; i<=vet.length - 1;i++) {
			eleito = vet[i];
			j = i-1;
			while(j >= 0 && vet[j] > eleito) {
				vet[j+1] = vet[j];
				j = j-1;
			}
			vet[j+1] = eleito;
		}
		return vet;
	}
}
