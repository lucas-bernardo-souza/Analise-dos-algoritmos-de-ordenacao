package back;

public class ShellSort {
	private int[] vet;
	private int n = 0;
	private int gap = 0;
	
	public ShellSort() {
		super();
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		this.n = vet.length;
		
		for(gap = n/2; gap > 0; gap /= 2) {
			for(int i = gap; i < n; i++) {
				int key = vet[i];
				int j = i;
				while(j >= gap && vet[j - gap] > key) {
					vet[j] = vet[j - gap];
					j -= gap;
				}
				vet[j] = key;
			}
		}
		return vet;
	}
}
