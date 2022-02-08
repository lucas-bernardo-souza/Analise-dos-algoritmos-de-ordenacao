package back;
// Quick Sort com pivo sendo o primeiro elemento da lista

public class QuickSort {
	private int[] vet;
	
	public QuickSort() {
		super();
	}
	
	private void swap(int i, int j) {
		int aux;
		aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}
	
	private int partition(int left, int right) {
		
		int pivot = vet[left];
		int i = left;
		
		for(int j = left + 1; j <= right; j++) {
			if(vet[j] <= pivot) {
				i++;
				swap(i, j);
			}
		}
		
		// Troca pivot (X[left] com i.
		swap(left, i);
		
		return i;
	}
	
	private void quickSort(int left, int right) {
		if(left < right) {
			int indexPivot = partition(left, right);
			quickSort(left, indexPivot - 1);
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
