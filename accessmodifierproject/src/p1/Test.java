package p1;
 public class Test {
	private int a = 20,b=30,c;
	private void sum() {
		c= a+b;
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.sum();
	}
}
