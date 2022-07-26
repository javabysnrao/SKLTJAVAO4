package p2;
import p1.Test;
class Demo extends Test{
     public static void main(String[] args) {
		  Test t = new Test(); //belongs package p1
		  t.sum();
	}
}
