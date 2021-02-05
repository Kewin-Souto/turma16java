package estoqueLoja;

public class Produto {

	
		private String nome;
		private double preco;
		private int estoque;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getEstoque() {
			return estoque;
		}
		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}
		public Produto(String nome, double preco, int estoque) {
			super();
			this.nome = nome;
			this.preco = preco;
			this.estoque = estoque;
		}
		
	
}

