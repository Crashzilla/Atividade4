package Atividade4;

public class Aeroporto extends Thread{
	
	private String nome;
	private boolean estadoPista = true;

	public Aeroporto(String nome) {
		super();
		this.nome = nome;
	}
	
	public synchronized void aguardarPistaDisponivel() throws InterruptedException{
		while (!estadoPista){
			wait();
		}
	}
	
	public synchronized void alterarEstadoPista() throws InterruptedException{
		Thread.sleep(3000);
		this.estadoPista = !estadoPista;
		System.out.println("Disponibilidade da pista: " + estadoPista);
		notifyAll();
	}
	
	public void run(){
		while (true){
			try {
				alterarEstadoPista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}











