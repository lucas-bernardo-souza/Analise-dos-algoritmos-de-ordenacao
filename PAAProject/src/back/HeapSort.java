package back;

public class HeapSort {
	private int[] vet;
	private int qtde = 0;
	
	public HeapSort() {
		super();
	}
	
	private void heapFica(int i, int qtde) {
		int fEsq, fDir, maior, aux;
		maior = i;
		if(2*i+1 <= qtde) {
			// o nó que está sendo analisado
			// tem filhos para esquerda e direita
			fEsq = 2*i+1;
			fDir = 2*i;
			if(vet[fEsq] >= vet[fDir] && vet[fEsq] > vet[i])
				maior = 2*i+1;
			else if(vet[fDir] > vet[fEsq] && vet[fDir] > vet[i])
				maior = 2*i;
		}
		else if(2*i <= qtde) {
			// o nó que está sendo analisado
			// tem filho apenas para a direita
			fDir = 2*i;
			if(vet[fDir] > vet[i])
				maior = 2*i;
		}
		if(maior != i) {
			aux = vet[i];
			vet[i] = vet[maior];
			vet[maior] = aux;
			heapFica(maior, qtde);
		}
	}
	
	private void transformaHeap() {
		int i;
		for(i=qtde/2; i>=1; i--) {
			heapFica(i, qtde);
		}
	}
	
	private void ordena() {
		int i, aux, ultimaPos;
		for(i=qtde; i>=2; i--) {
			aux = vet[1];
			vet[1] = vet[i];
			vet[i] = aux;
			ultimaPos = i - 1;
			heapFica(1, ultimaPos);
		}
	}
	
	public int[] ordena(int[] vet) {
		this.vet = vet;
		this.qtde = vet.length-2;
		
		transformaHeap();
		ordena();
		return vet;
	}
}
