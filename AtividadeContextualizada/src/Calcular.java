/**
 * 
 * @Franklin
 */
public class Calcular {
	int x;
    int y;
//1º Método
    public int getSoma() {   
        return this.x + this.y;
    }
    public void setSoma(int x, int y) {
        this.x = x;
        this.y = y;
    }
//2º Método 
    public void setSubtracao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getSubtracao() {
        return this.x - this.y;
    }
//3º Método  
    public void setMultiplicacao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getMultiplicacao() {
        return (this.x * this.y);    
    }
//4º Método  
    public void setDivisao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getDivisao() {
        return (this.x / this.y);    
    }        
}
