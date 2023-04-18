package Ch3;

public class TestYanghui {

	public static void main(String[] args) {
		int row = 6;
		int[][] yang = new int[row][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j) {
					yang[i][j] = 1;
				} else {
					yang[i][j] = yang[i-1][j-1] + yang[i-1][j];
				}
				System.out.print(yang[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
