package travel_agency;

public class MasterClient extends Cadastro {

	double precoTotal;
	
	// Assinatura do construtor da classe super(Cadastro)
	public MasterClient(String nome, String cpf, String sexo, String idade, String telefone, String email, int acompanhantes, String formaDePagamento) {
		super(nome, cpf, sexo, idade, telefone, email, acompanhantes, formaDePagamento);
	}

	// Metodo para calcular o valor total ja com o desconto
	public double desconto5PorCento(double precoPorPessoa, int acompanhantes) {
		// Preco total
		precoTotal = precoPorPessoa * (acompanhantes + 1);

		// Desconto
		double precoComDesconto = precoTotal * 0.90;
		return precoComDesconto;
	}

	@Override // Metodo para imprimir os dados da viagem
	public void imprimirPacoteDeViagem(String destino, double precoPorPessoa, double precoComDesconto,
			String diasDaViagem) {
		System.out.println("*DADOS DO PACOTE*");
		System.out.println("-->Destino: " + destino);
		System.out.println("-->Dias da viagem: " + diasDaViagem);
		System.out.println("-->Preço por pessoa: " + precoPorPessoa);
		System.out.println("-->Preço total incluindo acompanhante: " + precoTotal);
		System.out.println("-->Preço com desconto de 10%: " + precoComDesconto);

	}

	/***************************PACOTES DE VIAGEM ***************************/
	@Override
	public void pacote1() {
		String destino = "Salvador";
		double precoPorPessoa = 999;
		int acompanhantes = getAcompanhantes();
		double precoComDesconto = desconto5PorCento(precoPorPessoa, acompanhantes);
		String diasDaViagem = "(sex/sab/dom)";
		imprimirPacoteDeViagem(destino, precoPorPessoa, precoComDesconto, diasDaViagem);
	}

	@Override
	public void pacote2() {
		String destino = "Amsterdam";
		double precoPorPessoa = 13459;
		int acompanhantes = getAcompanhantes();
		double precoComDesconto = desconto5PorCento(precoPorPessoa, acompanhantes);
		String diasDaViagem = "(sex/sab/dom)";
		imprimirPacoteDeViagem(destino, precoPorPessoa, precoComDesconto, diasDaViagem);
	}

	@Override
	public void pacote3() {
		String destino = "Espanha";
		double precoPorPessoa = 3399;
		int acompanhantes = getAcompanhantes();
		double precoComDesconto = desconto5PorCento(precoPorPessoa, acompanhantes);
		String diasDaViagem = "(sex/sab/dom)";
		imprimirPacoteDeViagem(destino, precoPorPessoa, precoComDesconto, diasDaViagem);
	}

	@Override
	public void pacote4() {
		String destino = "Portugal";
		double precoPorPessoa = 12299;
		int acompanhantes = getAcompanhantes();
		double precoComDesconto = desconto5PorCento(precoPorPessoa, acompanhantes);
		String diasDaViagem = "(sex/sab/dom)";
		imprimirPacoteDeViagem(destino, precoPorPessoa, precoComDesconto, diasDaViagem);
	}
	/***********************************************************************/
}
