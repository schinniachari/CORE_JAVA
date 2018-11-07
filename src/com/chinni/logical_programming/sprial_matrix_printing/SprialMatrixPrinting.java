package com.chinni.logical_programming.sprial_matrix_printing;

public class SprialMatrixPrinting {
	static int iterationCount = 0;
	static int totalElements;

	public static void main(String[] args) {
		int R = 3;
		int C = 5;
		totalElements = (R+1) * (C+1);
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },{19,20,21,22,23,24} }; 
		int node=0;
		do {
			spiralPrint(R--, C--, node, node++, a);
		}while (iterationCount < totalElements);
		 
	}

	// Function print matrix in spiral form
	static void spiralPrint(int numOfRows, int numOfColumns, int rowPointer, int columnPointer, int a[][]) {
	
			// PRINT FIRST ROW
			for (int index = rowPointer; index <= numOfColumns; index++) {
				System.out.print(a[rowPointer][columnPointer++]);
				iterationCount++;
			}
			if(iterationCount>=totalElements)
				return;
			rowPointer++;
			columnPointer--;
			System.out.println();

			// PRINT THE LAST COLUMN
			for (int index = rowPointer; index <= numOfRows; index++) {
				System.out.print(a[index][columnPointer]);
				iterationCount++;
			}
			if(iterationCount>=totalElements)
				return;
			rowPointer = (++rowPointer) > numOfRows ? numOfRows : rowPointer;
			System.out.println();

			// PRINT THE LAST ROW
			for (columnPointer -= 1; columnPointer >= 0; columnPointer--) {
				System.out.print(a[rowPointer][columnPointer]);
				iterationCount++;
			}
			if(iterationCount>=totalElements)
				return;
			columnPointer++;
			System.out.println();

			// PRINT THE FIRST COLUMN
			for (rowPointer -= 1; rowPointer >= 1; rowPointer--) {
				System.out.print(a[rowPointer][columnPointer]);
				iterationCount++;
			} 
			if(iterationCount>=totalElements)
				return;
	}
}
