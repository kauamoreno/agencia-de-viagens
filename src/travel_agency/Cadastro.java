package travel_agency;

public abstract class Cadastro implements PacoteViagem{

	//Atributos da classe
	private String nome;
	private String cpf;
	private String sexo;
	private String idade;
	private String telefone;
	private String email;
	private int acompanhantes;
	private String formaDePagamento;
	
	//Construtor da classe
	public Cadastro(String nome, String cpf, String sexo, String idade, String telefone, String email, int acompanhantes, String formaDePagamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.acompanhantes = acompanhantes;
		this.formaDePagamento = formaDePagamento;
	}
	
	public void imprimirDadosDoUsuario() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Acompanhantes: " + getAcompanhantes());
		System.out.println("Forma de pagamento: " + getFormaDePagamento());
	}

	/************GETTERS************/
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public String getIdade() {
		return idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public int getAcompanhantes() {
		return acompanhantes;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	/*******************************/
}
