
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Moana");
		
		HelloWorld hw = new HelloWorld();
		
		final int myNumber = 6;
		if (hw.printBinaryLessThan8MoreGeneral(myNumber) == false) {
			System.out.print(myNumber);
			System.out.println(" is out of range 0..7");
		};

	}
	
	/**
	 * prints argument "n" as a binary number, if 0 <= n <= 7
	 * @param n : decimal number 
	 * @return false, if not (0 <= n <= 7); true, else; prints binary number
	 */
	public boolean printBinaryLessThan8 (int n) {
		if ( (n > 7) || (n < 0) ) {
			return false;
		}
		/* ASSERTION: 0 <= n <= 7 */
		if (n >= Math.pow(2, 2)) {
			System.out.print("1");
			n -= Math.pow(2, 2);
		} else {
			System.out.print("0");
		}

		/* ASSERTION: 0 <= n <= 3 */
		if (n >= Math.pow(2, 1)) {
			System.out.print("1");
			n -= Math.pow(2, 1);
		} else {
			System.out.print("0");
		}
		
		/* ASSERTION: 0 <= n <= 1 */
		if (n >= Math.pow(2, 0)) {
			System.out.print("1");
			n -= Math.pow(2, 0);
		} else {
			System.out.print("0");
		}
		
		return true;
	}
	
	public boolean printBinaryLessThan8MoreGeneral (int n) {
		if ( (n > 7) || (n < 0) ) {
			return false;
		}
		
		int exponent = 2;
		
		while (exponent >= 0) {
			/* ASSERTION: 0 <= n <= pow(2,exponent) */
			if (n >= Math.pow(2, exponent)) {
				System.out.print("1");
				n -= Math.pow(2, exponent);
			} else {
				System.out.print("0");
			}	
			exponent--;
		}
		
		return true;
	}

}
