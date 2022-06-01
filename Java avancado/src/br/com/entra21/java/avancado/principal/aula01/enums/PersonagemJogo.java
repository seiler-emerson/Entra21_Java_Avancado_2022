package br.com.entra21.java.avancado.principal.aula01.enums;

public enum PersonagemJogo {
	BARBARO(1000,"Muito HP"), ANAO(100,"Ferreiro"), DRUIDA(50,"Suporte"), SACERDOTE(10,"Cura e corre");
	
	private final int HP;
	private final String DESCRICAO;
	
	private PersonagemJogo(int vida, String descricao) {
		this.HP = vida;
		this.DESCRICAO = descricao;
	}

	public int getHP() {
		return HP;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

}
