public class num{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int sum = 0;
		
		for(int i = n; i<=m;i++){
			int j = i;
			//sum = j%10;
			while(j > 9){
				j = j/10;
				sum = sum + j%10;
			}
			if(i%2==0 && sum%2==1 && j%2==1 ){
				System.out.println(i);
			}
		}
	}		
	
}
