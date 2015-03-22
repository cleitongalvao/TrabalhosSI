import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;



public class BuscaEmLargura {

	static class Vertice 
	{
		int valor;
		boolean visitado = false; // inicia todo Nó como não-visitado
		List<Vertice> vertices = new ArrayList<>();
		
		public Vertice(int valor) {
			super();
			this.valor = valor;
			
		}
		
		public void adicionaVertice(Vertice v) {
			vertices.add(v); // adiciona vértice 
		}
	}
	
}
