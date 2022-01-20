package THREADS;

public class EvenOddThreads {
       public static void main(String[] args) {
    	   String mainThreadName =Thread.currentThread().getName();
    	   System.out.println(mainThreadName + "thread");
    	   
    	   EvenThread evenThread =new EvenThread();
    	   evenThread.setName("evenThread");
    	   String evenThreadName = evenThread.getName();
    	   System.out.println(evenThreadName + "thread");
    	   
    	   OddThread oddThread =new OddThread();
    	   oddThread.setName("oddThread");
    	   String oddThreadName = evenThread.getName();
    	   System.out.println(oddThreadName + "thread");
       }
}

class EvenThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i=i+2) {
			System.out.println("EVEN : " + i);
		}
	}
}
class OddThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i=i+2) {
			System.out.println("ODD : " + i);
		}
	}
}