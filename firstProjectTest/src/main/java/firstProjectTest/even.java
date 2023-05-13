package firstProjectTest;

public class even {
	public static void main(String[]arg) {
		even e =new even();
		e.print(5, 11, 20);
		//int n=10;
		//for(int i=0; i<=n; i++) {
		//	System.out.printf("%d * %d = %d",2,i,2*i).println();
		//}
	}
		void print(int table, int from, int to) {
			for(int i=from; i<=to; i++) {
				System.out.printf("%d * %d = %d" ,table,i ,table * i).println();
			}
		}
	}


