package basic;

public class RuntimeExcep {

	public static void main(String[] args) {
		try {
			int c = 10 / 0;
			System.out.println(c);
			int a[] = { 1, 2, 3, 4, 5 };
			a[2] = 45;
			System.out.println(a[2]);

			int b = Integer.parseInt("abc");
			System.out.println(b);

			String data = null;
			System.out.println(data.length());
			
			
		} catch (ArithmeticException e) {
			System.out.println("number cant divide by 0" + e);
		}

		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}

		catch (NumberFormatException e2) {
			System.out.println(e2);
		}

		catch (NullPointerException e3) {
			System.out.println(e3);
			
			
		} finally {
			System.out.println("code blockends");
		}
	}
}
