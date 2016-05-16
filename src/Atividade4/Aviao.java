package Atividade4;

public class Aviao extends Thread {
	
	private String nome;
	private Aeroporto aeroporto;
	
	public Aviao(String nome, Aeroporto aeroporto) {
		super();
		this.nome = nome;
		this.aeroporto = aeroporto;
	}
	
	public void decolar() throws InterruptedException{
		aeroporto.aguardarPistaDisponivel();
		System.out.println("O vôo " + nome + " está decolando");
	}
	
	public void voar(){
		System.out.println("O vôo " + nome + " está voando.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void aterrissar() throws InterruptedException{
		aeroporto.aguardarPistaDisponivel();
		System.out.println("O vôo " + nome + " está aterrissando.");
	}
	
	public void run(){
		try {
			decolar();
			voar();
			aterrissar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
