
public class Ponto 
{
		 private int x, y;
	     private boolean visitado;
	     
	     public Ponto(int x, int y){
	         this.x=x;
	         this.y=y;
	         visitado=false;
	     }//fim ponto
	     
	     public void setVisitado(boolean visita){
	         this.visitado=visita;
	     }//fim setVisitado
	     
	     public boolean getVisitado(){
	         return visitado;
	     }//fim getVisitado
	     
	     public void setX(int x){
	         this.x=x;
	     }//fim setX
	     public void setY(int y){
	         this.y=y;
	     }//fim setY
	     public int getX(){
	         return x;
	     }//fim getX
	     public int getY(){
	         return y;
	     }//fim getY
	     @Override
	     public String toString(){
	         return "("+Integer.toString(x)+","+Integer.toString(y)+")";
	     }

} //Fim da Classe Ponto
