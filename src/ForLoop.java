
public class ForLoop {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=1+i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		System.out.println("******************************************");

		
		for(int i=0; i<4; i++) {
			for(int j=1; j<=1+i; j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("******************************************");

		int s=1;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(s);
				System.out.print("\t");
				s++;
			}
			System.out.println("");
		}
		System.out.println("******************************************");

		int a=1;
		for(int i=1; i<4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(3*a);
				System.out.print("\t");
				a++;
			}
			System.out.println("");
		}

	}

}
