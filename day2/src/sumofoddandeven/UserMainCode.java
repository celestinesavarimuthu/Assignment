package sumofoddandeven;

public class UserMainCode {
	
	static int sum(int n) {
		int rem1=0;
				int rem2=0;
				int sumodd=0;
		int num=n;
		int sumeven=0;
		 while(n>0) {
			 rem1=n%10;
			 sumodd=sumodd+rem1;
			 n=n/100;
		 }
		 num=num/10;
		 while(num>0) {
			 rem2=num%10;
			 sumeven=sumeven+rem2;
			 num=num/100;
			 
		 }
		 if(sumodd==sumeven)
			return 1; 
		 else
			 return-1;
			
	}

}
