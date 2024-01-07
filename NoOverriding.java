class A {
    private void nonOverrideableMethod() {
        System.out.println("This method cannot be overridden.");
    }

    public void callNonOverrideableMethod() {
        nonOverrideableMethod();
    }
}

class B extends A {

    /* @Override
    private void nonOverrideableMethod() {
         System.out.println("This won't compile.");
    }
     */
}

public class NoOverriding {
    public static void main(String[] args) {
        A objA = new A();
        objA.callNonOverrideableMethod();

        B objB = new B();
        objB.callNonOverrideableMethod(); // Call the nonOverrideableMethod through the reference of class B
    }
}

