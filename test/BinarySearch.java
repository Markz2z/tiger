class BinarySearch{ 
    public static void main(String[] a){
	System.out.println(new BS().Start(20));
    }
}

class BS{
    int[] number ;
    int size ;
    public int Div(int num){
	int count01 ;
	int count02 ;
	int aux03 ;

	count01 = 0 ;
	count02 = 0 ;
	aux03 = num - 1 ;
	while (count02 < aux03) {
	    count01 = count01 + 1 ;
	    count02 = count02 + 2 ;
	}
	return count01 ;	
    }

}
