package programing;

public class dimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr = new int[3][2];
		arr[0][1]=17;
		arr[2][0]=12;
		arr[0][0]=1;
		arr[1][0]=5;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
