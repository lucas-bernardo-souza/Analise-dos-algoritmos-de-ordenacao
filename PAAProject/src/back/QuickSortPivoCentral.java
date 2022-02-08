package back;
// Quick Sort com pivô sendo elemento central da lista

public class QuickSortPivoCentral {
	private int[] vet;

	public QuickSortPivoCentral() {
		super();
	}
	
	private void swap(int i, int j) {
		int aux;
		aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}
	
	private int partition(int left, int right) {
		
		int pivot = vet[(left+right)/2];
		int i = left - 1;
		int j = right + 1;
		
		while(i < j) {
			do {
				j--;
			}
			while(vet[j] > pivot);
			do {
				i++;
			}
			while(vet[i] < pivot);
			if(i < j)
				swap(i, j);
		}
		return j;
	}
	
	private void quickSort(int left, int right) {
		int indexPivot;
		if(left < right) {
			indexPivot = partition(left, right);
			quickSort(left, indexPivot);
			quickSort(indexPivot + 1, right);
		}
		return;
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		
		quickSort(0, vet.length-1);
		return vet;
	}
}
