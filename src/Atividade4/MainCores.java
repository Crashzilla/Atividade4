package Atividade4;

public class MainCores {
	
	public static void main (String[] args){
		
		for (Cores cores : Cores.values()){
			System.out.println(cores.getNome() + " | " + cores.getCodigo());
		}
		
		System.out.println("---------------");
		
		for (Cores cores : Cores.values()){
			if (cores.getNome() == "branco"){
				System.out.println("O c�digo da cor branca � " + cores.getCodigo());
			}
		}
		
	}
}
