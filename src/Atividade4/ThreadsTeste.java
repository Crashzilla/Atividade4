package Atividade4;

public class ThreadsTeste {
	
	public static void main(String[] args){
	
		int tamt1 = 32;
		int tempot1 = 20;
		int tamt2 = 0;
		int tempot2 = 10;
		
		Paralelo p1 = new Paralelo(tamt1, tempot1*1000);
		Paralelo p2 = new Paralelo(tamt2, tempot2*1000);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		while(true){
			if (t1.isAlive() == true)
				System.out.println("A thread de mensagens se encontra ativa.");
			else
				System.out.println("A thread de mensagens se encontra inativa.");
			
			if (t2.isAlive() == true)
				System.out.println("A thread de data se encontra ativa.");
			else
				System.out.println("A thread de data se encontra inativa.");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
