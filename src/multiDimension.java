
public class multiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//9   44   5
	//13  2   7
	//6   44  3
	//Find the min nomin this matrix
		
		int abc[][] = {{9,3,5},{13,2,7},{6,44,3}};
		int min= abc[0][0];
		int minIndexCol = 0;
		
		for(int i=0; i<3; i++) {//row
			
			for(int j=0; j<3; j++) {//col
				
				if(abc[i][j]<min) {
					min = abc[i][j];
					minIndexCol = j;
				}
				
			}
		}
		System.out.println("min no cloumn index is : "+ minIndexCol);
		
		//To find max value in that column
		
		int max=abc[0][minIndexCol];
		int k=0;
		while(k<3) {

		//for(int k=0; k<3; k++) {
			if(abc[k][minIndexCol]>max) {
				System.out.println("Max value in min value of matric : " +  abc[k][minIndexCol]);
				System.out.println(k);
				
			}
			k++;

		}
			
	
		
		
		 
	}
	

}
