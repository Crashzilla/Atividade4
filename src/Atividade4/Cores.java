package Atividade4;

public enum Cores {
	
	White ("branco", 21),
	Black ("preto", 22),
	Red ("vermelho", 23),
	Yellow ("amarelo", 24),
	Blue ("azul", 25);
	
	private String nome;
	private int codigo;

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	private Cores(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
}
