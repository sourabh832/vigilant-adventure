
public class Pattern {
	
	
	static void numberTrianglePattern(){
		
		
		for(int i=1; i<=6;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	static void ABCDTrianglePattern(){
		
		
		char a='A';
		int a1=65;
		
		System.out.println((int)a);
		System.out.println((char)a1);
		
		for(int i=65;i<=69;i++) {
			
			for(int j=65;j<=i;j++) {
				
				System.out.print((char)j+" ");
			}
			
			
			System.out.println();
		}
		
	}
	
	static void BoxPattern(){
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4;j++) {
				if(i==1) {
				for (int k=1;k<=1;k++) {
					System.out.print("$"+" ");
					
				}}
				
				if(i==2||i==3) {
					
					if(j==1||j==4) {					
					System.out.print("$"+" ");}
					else if(j==2||j==3) {
						System.out.print("  ");
						
					}
				}
				
				if(i==4) {
					for (int k=1;k<=1;k++) {
						System.out.print("$"+" ");
						
					}}
				
			}			
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberTrianglePattern();
		ABCDTrianglePattern();
		BoxPattern();

	}

}
