/**
 * 
 * @Franklin
 */
public class Calcular {
	int x;
    int y;
//1� M�todo
    public int getSoma() {   
        return this.x + this.y;
    }
    public void setSoma(int x, int y) {
        this.x = x;
        this.y = y;
    }
//2� M�todo 
    public void setSubtracao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getSubtracao() {
        return this.x - this.y;
    }
//3� M�todo  
    public void setMultiplicacao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getMultiplicacao() {
        return (this.x * this.y);    
    }
//4� M�todo  
    public void setDivisao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getDivisao() {
        return (this.x / this.y);    
    }        
}
