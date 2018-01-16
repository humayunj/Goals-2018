class Q {
    int n;
    boolean ValueSet = false;
    synchronized int get() {
        while (!ValueSet) {
            try {
                wait();
            } catch (InterruptedException e) { e.printStackTrace();}
        }
        ValueSet = false;
        System.out.println("Got: "+n);
        notify();
        return n;
    }

    synchronized void put (int n ) {
        while (ValueSet) {
            try {
            wait();
            } catch (InterruptedException e) { e.printStackTrace();}
        }
        ValueSet = true;
        this.n = n;
        System.out.println("Put: "+n);
        notify();
    }
}


class Producer implements Runnable {
    Q q;
    Producer (Q q) {
        this.q = q;
        new Thread(this,"Producer").start();
    }
    public void run()
    {
        int i = 0;
        while (true ) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Consumer (Q q) {
        this.q = q;
        new Thread(this,"Consumer").start();
        
    }
    public void run()
    {
        while (true ) {
            q.get();
        }
    }
}

class Main {
    public static void main(String[] args)
    {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}