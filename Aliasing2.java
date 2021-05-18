import java.util.*;

public class Aliasing2 {
    public static void main(String[] params) {
	    /* Because aliasing is excuted at runtime 
	       It knows that the first element should be 
	       a B object instead of an A. 
	       There the code below throws a runtime error
		    B[] b = new B[10];
		    A[] a = b;
		    a[0] = new A();
		    b[0].methodParent(); 
	    */
	    B[] b = new B[10];
	    A[] a = b; // b is aliased to a
	    a[0] = new B();
	    b[0].methodParent(); // prints override method in child
	    a[0].methodParent(); // prints override method in child

	    A first = new A(1);
	    B sec = new B(2);

        first = sec;
        // first.val = 3;
        sec.val = 3;

        System.out.println("first: " + first.val);
        System.out.println("sec: " + sec.val);        
	    System.exit(0);
    }

}

class A {
	public int val;

	public A () {}

	public A (int v) {
		this.val = v;
	}

	public void methodParent() {
		System.out.println("method in parent");
	}
}

class B extends	A {
	public int val;

	public B () {}

	public B (int v) {
		this.val = v;
	}

	public void methodParent() {
		System.out.println("override method in child");
	}

	public void methodChild() {
		System.out.println("method in child");
	}
}
