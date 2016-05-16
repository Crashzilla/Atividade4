package Atividade4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paralelo implements Runnable {
	
	private int tamanho;
	private int tempo;

	public Paralelo (int tamanho, int tempo) {
		super();
		this.tamanho = tamanho;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		if (tamanho != 0){
			ArrayList<String> lista = new ArrayList<>();
			
			for (int i=1; i<=tamanho; i++){
				lista.add("Item Nº" + i);
			}
			
			try {
				for(int i=0; i<lista.size(); i++){
					System.out.println(lista.get(i));
					Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (tamanho == 0){
			while(true){
				try {
					System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
					Thread.sleep(tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
