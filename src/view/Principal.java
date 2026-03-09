package view;

import java.util.Arrays;

import br.com.oliveiraJe.sort.BubbleSort;
import br.com.oliveiraJe.sort.MergeSort;

public class Principal {

	public static void main(String[] args) {
		int[] vet1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vet2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vet3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
        
        BubbleSort.sort(vet1); 
        BubbleSort.sort(vet2); 
        MergeSort.sort(vet3);
        
        System.out.println("Vetor 1 ordenado por Bubble sort: " + Arrays.toString(vet1));
        System.out.println("Vetor 2 ordenado por Bubble Sort: " + Arrays.toString(vet2));
        System.out.println("Vetor 3 ordenado por Merge Sort: " + Arrays.toString(vet3));
	}

}
