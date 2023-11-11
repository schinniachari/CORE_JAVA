package com.chinni.projects.shapes;

public class SparialMatrixMain {
	public static void main(String[] args) {
		// int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {
		// 13, 14, 15, 16 } };
		// int[][] mat = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13,
		// 14, 15, 16, 17, 18 },
		// { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33,
		// 34, 35, 36 } };
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int maxi = mat[0].length - 1, maxj = mat[0].length - 1, curri = 0, currj = 0, mini = 0, minj = 0;

		for (int i = 0; i < mat[0].length / 2; i++) {
			curri = mini;
			currj = minj;
			for (int t1 = minj; t1 <= maxj; t1++) {
				System.out.print(mat[curri][t1] + " ");
				currj = t1;
			}
			// System.out.println("\n" + i + " 1-----");
			for (int t1 = mini + 1; t1 <= maxi; t1++) {
				System.out.print(mat[t1][currj] + " ");
				curri = t1;
			}
			// System.out.println("\n" + i + " 2-----");

			for (int t1 = maxj - 1; t1 >= minj; t1--) {
				System.out.print(mat[curri][t1] + " ");
				currj = t1;
			}
			// System.out.println("\n" + i + " 3-----");
			mini++;
			for (int t1 = maxi - 1; t1 >= mini; t1--) {
				System.out.print(mat[t1][currj] + " ");
				curri = t1;
			}
			// System.out.println("\n" + i + " .4-----");
			minj++;
			maxi--;
			maxj--;
		}
		int len = mat[0].length;
		if (len % 2 != 0)
			System.out.println(mat[len / 2][len / 2]);
	}
}
