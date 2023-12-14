package ejercicio3B;

public class TestAscensor {
	
	 public static void main(String[] args) throws InterruptedException {
	        ascensor elevator = new ascensor();
	        Thread[] threads = new Thread[30];
	        for (int i = 0; i < 30; i++) {
	            threads[i] = new Thread(new persona(elevator));
	            threads[i].start();
	        }
	        for (int i = 0; i < 30; i++) {
	            threads[i].join();
	        }
	    }

}
