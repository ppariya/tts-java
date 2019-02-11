
public class SquaresOfASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    public int[] sortedSquares(int[] A) {
		        
		        for (int i = 0; i < A.length; i++ ){
		            for(int x = 0; x < A.length; x++){
		                if (A[i] > A[x]){
		                    A[x] = A[i];                    
		                }
		                if (A[i] < A[x]){
		                    A[x] = A[i];
		                }
		                
		            }
		        }
		        
		        for (int i = 0; i <A.length; i++){
		            A[i] = A[i] * A[i];
		        }
		    }
	
	}

}
