package controller;

import br.edu.fateczl.MergeSort.OrdenacaoMergeSort;

public class ControllerMergeSortEx01 {

	public ControllerMergeSortEx01() {
		super();
	}
	
	public void ordenarMergeSort01() {
		OrdenacaoMergeSort mergeSortEx01 = new OrdenacaoMergeSort();
		
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		mergeSortEx01.ordenarMergeSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}
