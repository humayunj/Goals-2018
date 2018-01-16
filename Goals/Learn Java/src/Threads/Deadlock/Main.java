

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { e.printStackTrace(); };
        System.out.println(name+ " Trying to call b.last");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside  A.last");
    }
}
class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { e.printStackTrace();};
        System.out.println(name + "Trying to call A.last");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class Main implements Runnable {
    A a = new A();
    B b = new B();

    Main() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this,"RacingThread");
        t.start();
        a.foo(b);

        System.out.println("Back in Main thread");
    }

    public void run() {
        b.bar (a);
        System.out.println("Back in other Thread");
    }
    public static void main(String[] args){
        new Main();
    }

}