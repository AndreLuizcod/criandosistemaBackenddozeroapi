package br.com.andreLuiz.projeto.dto;

public class AcessDTO {

	
	private String token;
	
	

	public AcessDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	//TODO implementar retornar o usuário e liberações (authorities)
}
