package controlador;

import java.util.ArrayList;

import back.BubbleSortMelhorado;
import back.BubbleSortOriginal;
import back.HeapSort;
import back.InsetionSort;
import back.MergeSort;
import back.QuickSort;
import back.QuickSortPivoCentral;
import back.SelectionSort;
import back.ShellSort;
import back.Vetor;

public class Controler {
	public static void main(String[] args) {
		Vetor vet = new Vetor();
		ArrayList<String> tempo = new ArrayList<String>();

		BubbleSortMelhorado bublleSortMelhor = new BubbleSortMelhorado();
		BubbleSortOriginal bubbleSort = new BubbleSortOriginal();
		HeapSort heap = new HeapSort();
		InsetionSort insetion = new InsetionSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		QuickSortPivoCentral quickCentral = new QuickSortPivoCentral();
		ShellSort shel = new ShellSort();
		SelectionSort selection = new SelectionSort();
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = bubbleSort.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Bubble Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = bublleSortMelhor.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Bubble Sort (melhorado): " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = quick.ordena(vet.gerarDecrescente(15000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Quick Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = quickCentral.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Quick Sort (Central): " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = insetion.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Insetion Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = shel.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Shel Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = selection.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Selection Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = heap.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Heap Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		
		for(int i = 0; i < 10; i++) {
			long tempoInicial = System.currentTimeMillis();
			int[] vetorOrdenado = merge.ordena(vet.gerarDecrescente(25000));
			long tempoFinal = System.currentTimeMillis();
			tempo.add("Tempo de execução Merge Sort: " + (tempoFinal - tempoInicial) + " Milissegundos");
		}
		

		// Vetor ordenado
		for (int i = 0; i < tempo.size(); i++) {
			System.out.println(tempo.get(i));
		}
	}

}
