package back;

public class BubbleSortOriginal {
	private int[] vet;
	private int aux = 0;
	private int i = 0;
	private int j = 0;
	
	public BubbleSortOriginal() {
		super();
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		
		for(i = 0; i<vet.length; i++){
			for(j = 0; j<vet.length-1; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		return vet;
	}
}
