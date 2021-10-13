package GlobalLogic;

//Write a method to display the first 50 pentagonal numbers
public class Ex1 {

	public static void main(String[] args) {
		int count= 0;
		for(int i=0; i<=50; i++) {
			System.out.printf(" %d ", getPentaNo(i));
			if(count%10==0) {
				System.out.println();
			}
			count++;
		}
	}
	public static int getPentaNo(int i) {
		return (i*(3*i - 1))/2;
//		System.out.println(result);
	}
	
}
