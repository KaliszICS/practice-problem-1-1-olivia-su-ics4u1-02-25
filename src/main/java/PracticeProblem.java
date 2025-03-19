public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D (int[][] array2D) {
		int sum = 0;
		for (int row = 0; row < array2D.length; row++){
			for (int col = 0; col < array2D[row].length; col++){
				sum = sum + array2D[row][col];
				}
			}
		return sum;
		
		}


	public static int sumRow (int[][] array2D, int row){
		int sum = 0;
		for(int i = 0; i < array2D[row].length; i++){
			sum = sum + array2D[row][i];
		}
		return sum;
	}

	public static int sumColumn (int[][] array2D, int col){
		int sum = 0;
		for(int j = 0; j < array2D.length; j++){
				sum = sum + array2D[j][col];
		}
		return sum;
	}

// finallllly itsss overrrerererer

}
