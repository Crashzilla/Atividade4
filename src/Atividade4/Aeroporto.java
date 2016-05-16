package Atividade4;

public class Aeroporto extends Thread{
	
	private String nome;
	private boolean estadoPista;

	public Aeroporto(String nome) {
		super();
		this.nome = nome;
	}
	
	public synchronized void aguardarPistaDisponivel() throws InterruptedException{
		while (!estadoPista){
			this.wait();
		}
		estadoPista = !estadoPista;
	}
	
	public synchronized void alterarEstadoPista() throws InterruptedException{
		this.estadoPista = !estadoPista;
		System.out.println("Disponibilidade da pista: " + estadoPista);
		this.notifyAll();
	}
	
	public void run(){
		while (true){
			try {
				Thread.sleep(3000);
				alterarEstadoPista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}











