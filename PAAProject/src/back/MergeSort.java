package back;

public class MergeSort {
	private int[] vet;
	private int inicio=0;
	private int fim=0;
	
	public MergeSort() {
		super();
	}
	
	private void intercala(int inicio, int fim, int meio) {
		int poslivre, inicioVetUm, inicioVetDois, i;
		int aux[] = new int[vet.length];
		inicioVetUm = inicio;
		inicioVetDois = meio + 1;
		poslivre = inicio;
		while(inicioVetUm <= meio && inicioVetDois <= fim) {
			if(vet[inicioVetUm] <= vet[inicioVetDois]) {
				aux[poslivre] = vet[inicioVetUm];
				inicioVetUm++;
			}
			else {
				aux[poslivre] = vet[inicioVetDois];
				inicioVetDois++;
			}
			poslivre++;
		}
		// se ainda existem números no primeiro vetor
		// que não foram intercalados
		for(i = inicioVetUm; i<=meio; i++) {
			aux[poslivre] = vet[i];
			poslivre++;
		}
		// se ainda existem números no segundo vetor
		// que não foram intercalados
		for(i = inicioVetDois; i<=fim;i++) {
			aux[poslivre] = vet[i];
			poslivre++;
		}
		// retorna os valores do vetor aux para o vetor x
		for(i=inicio; i<=fim;i++) {
			vet[i] = aux[i];
		}
	}
	
	private void merge(int inicio, int fim) {
		int meio;
		if(inicio < fim) {
			meio = (inicio+fim)/2;
			merge(inicio,meio);
			merge(meio+1,fim);
			intercala(inicio, fim, meio);
		}
	}
	
	public int[] ordena(int[] X) {
		this.vet = X;
		fim = vet.length-1;
		
		merge( inicio, fim);
		return vet;
	}
}
