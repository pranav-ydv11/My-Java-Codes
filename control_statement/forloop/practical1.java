class composite{
	public static void main(String arg[]){
		int n=3;
		int count=0;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				count++;
			}
		}
			if(count>2){
				System.out.println("composite Num");
			}
			else{
				System.out.println("not composite Num");
			}
		
	}
}

