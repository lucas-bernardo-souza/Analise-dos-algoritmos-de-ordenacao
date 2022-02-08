package back;

import java.util.Random;

public class Vetor {
	private int[] vet;
	Random random = new Random();
	
	public Vetor() {
		super();
	}

	public int[] gerar(int dim) {
		vet = new int[dim];
		for(int i = 1; i < dim - 1; i++) {
			vet[i] = random.nextInt(dim);
		}
		return vet;
	}
	
	public int[] gerarCrescente(int dim) {
		vet = new int[dim];
		for(int i = 1; i < dim - 1; i++) {
			vet[i] = i;
		}
		return vet;
	}
	
	public int[] gerarDecrescente(int dim) {
		vet = new int[dim];
		int j = dim;
		for(int i = 1; i < dim - 1; i++) {
			vet[i] = j;
			j--;
		}
		return vet;
	}
}
