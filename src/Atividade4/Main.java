package Atividade4;

public class Main {
	
	public static void main(String[] args){
		
		Aeroporto aeroporto = new Aeroporto("Guarulhos");
		Aviao a1 = new Aviao("TAN 123", aeroporto);
		Aviao a2 = new Aviao("OLÉ 111", aeroporto);
		Aviao a3 = new Aviao("LINHA 222", aeroporto);
		
		Thread aero = new Thread(aeroporto);
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(a3);
		
		aero.start();
		t1.start();
		//t2.start();
		//t3.start();
		
	}
}
