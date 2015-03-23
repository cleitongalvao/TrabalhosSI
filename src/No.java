import java.util.ArrayList;

/*

 */
public class No {
    private Ponto ponto;//Localizacao do no na matriz
    private ArrayList<No> vizinhos;//Lista de nos vizinhos a este
    private int valor;//valor do no => 1-obstaculo 0-caminho 2-inicio 3-fim
    private boolean noVisitado;//variavel que marca se o no ja foi visitado
    private No pai;//no pai
    
    /**
     * Construtor da classe sem parametros
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public No(){
        noVisitado=false;
        vizinhos = new ArrayList();
        
    }//fim Construtor
    
    /**
     * Construtor da classe com parametro posição
     * @param x int: posicao relativa as linhas
     * @param y int: posicao relativa as colunas
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public No(int x, int y){
        noVisitado=false;
        this.ponto = new Ponto(x,y);
        vizinhos=new  ArrayList();
    }//fim construtor
    
    /**
     * Construtor da classe, recebe como parametro a posicao do no na matriz e seu valor
     * @param x int: posicao relativa as linhas
     * @param y int: posicao relativa as colunas
     * @param valor int: valor do no -> 0 - caminho 1-obstaculo 2-inicio 3-saida
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public No (int x, int y, int valor){
        noVisitado=false;
        this.ponto=new Ponto(x,y);
        this.valor=valor;
        vizinhos=new ArrayList();
    }//fim construtor
    
    /**
     * Metodo que muda o valor da localizacao do no na matriz
     * @param x int : posicao relativa as linhas
     * @param y  int: posicao relatica as colunas
     */
    public void setLocalizacao(int x, int y){
        ponto.setX(x);
        ponto.setY(y);
    }//fim setLocalizacao
    
    /**
     * Metodo que retorna a posicao relativa as linhas do no
     * @return x int
     */
    public int getX(){
        return ponto.getX();
    }//fim getX
    
    /**
     * Metodo que retorna o posicao relatica a y (colunas) do no na matriz
     * @return 
     */
    public int getY(){
        return ponto.getY();
    }//fim getY
    
    /**
     * Metodo que adiciona um no vizinho aa lista de vizinhos do no atual
     * @param x int: posicao do no vizinho em relacao as linhas
     * @param y int: posicao do no vizinho em relacao as colunas
     * @param valor int : valor do no
     * @return true: se o no foi adicionado e false caso contratio
     */
    public boolean addVisinho( int x, int y, int valor){
        return vizinhos.add(new No(x,y,valor));
    }//fim addVisinho
    /**
     * Metodo que adiciona um no vizinho aa lista de vizinhos do no atual
     * @param v No: no vizinho
     * @return true se o no foi incluido e false caso contrario
     */
    public boolean addVisinho(No v){
        return vizinhos.add(v);
    }//fim addVisinho
    /**
     * Metodo que marca o no como visitado 
     */
    public void visitar(){
        noVisitado=true;
    }//fim visitar
    /**
     * Metodo que verifica se o no foi visitado
     * @return 
     */
    public boolean isVisitado(){
        return noVisitado;
    }//fim isVisitado
    /**
     * Metodo que retorna a lista de vizinho do no atual
     * @return 
     */
    public ArrayList<No> getVizinho(){     
       return vizinhos;
    }//fim getVizinho
    
    /**
     * Metodo que muda por completo a lista de nos vizinhos do no atual
     * @param v 
     */
    public void setVizinhos(ArrayList<No> v){
        vizinhos=v;
    }
    /**
     * Metodo que retorna o valor do no atual
     * @return 
     */
    public int getValor(){
        return valor;
    }//fim getValor
    /**
     * Metodo que muda o valor do no atual
     * @param valor 
     */
    public void setValor(int valor){
        this.valor=valor;
    }//fim setValor
     
    /** 
     * Metodo que converte a classe em uma string mostrando apenas os pontos relativos na matriz
     * @return (x,y) : String
     */
    @Override
    public String toString(){
       return ponto.toString();
    }//fim toString
    /**
     * Metodo que converte a classe em uma string mostrando os pontos relativos na matriz e seus vizinhos
     * @param n int: parametro qualquer
     * @return [(x,y)]=>[(x1,y1),...]
     */
    public String toString(int n){
        String str = "["+ponto.toString()+"] => [";
        for (int i = 0; i < vizinhos.size(); i++) {
            if (i==vizinhos.size()-1)
                str+=vizinhos.get(i).toString()+"]";               
            else
                str+=vizinhos.get(i).toString()+",";
        }//fim for
        return str;
    }//fim toString
    
    /**
     * Metodo que converte a classe em uma string mostrando os pontos relativos na matriz e o pai que visitou o no
     * @param c char: parametro qualquer
     * @return [(x,y)]==>[(x1,y1)]
     */
    public String toString (char c){
        return "["+ponto.toString()+"] ==> ["+pai+"]";
    }//fim toString
    
    /**
     * Metodo que retorna o pai do no
     * @return 
     */
    public No getPai(){
        return pai;
    }//fim getPai
    /**
     * Metodo que muda o pai do no
     * @param pai No : pai do no
     */
    public void setPai(No pai){
        this.pai=pai;
    }//fim setPai
    
}//fim class No