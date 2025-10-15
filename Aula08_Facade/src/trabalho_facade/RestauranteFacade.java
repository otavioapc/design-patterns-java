package trabalho_facade;

public class RestauranteFacade {

	// Atributos

	private Pedido pedido;
	private Estoque estoque;
	private Pagamento pagamento;
	private Notificacao notificacao;
	
	//Construtor

	public RestauranteFacade() {
		this.pedido = new Pedido();
		this.estoque = new Estoque();
		this.pagamento = new Pagamento();
		this.notificacao = new Notificacao();

	}

	// Métodos

	public void fazerPedido(String item, double valor) {

		if (pedido.criarPedido(item) == false) {

			notificacao.enviarNotificacao("Apenas Pizza e Lasanha são aceitos!");

		} else {

			if (estoque.verificarEstoque(item) == false) {

				notificacao.enviarNotificacao("Seu pedido não há no estoque!");

			} else {

				if (pagamento.processarPagamento(item, valor) == false) {

					notificacao.enviarNotificacao("Valor incorreto para o pedido!");

				} else {

					notificacao.enviarNotificacao("Pedido solicitado com sucesso!");

				}

			}

		}

	}

}
