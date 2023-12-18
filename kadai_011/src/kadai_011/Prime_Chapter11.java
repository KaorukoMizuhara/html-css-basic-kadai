package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[]primeNum=new boolean[101];
		for(int i=0;i<=100;i++) {
			primeNum[i]=true;
			
			
		}
		for(int i=2;i<=100;i++) {
			int k=0;
				for(int j=i+1;j<=100;j++) {
					if (j%i==0) {
					
						primeNum[j]=false;
						continue;
						
					 }	
				} 
			    
				
		}
	for(int i=2;i<=100;i++) {
		if (primeNum[i]) {
			System.out.println(i);
		}
	}
		
	}
}
