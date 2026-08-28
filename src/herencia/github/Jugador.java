package herencia.github;
public class Jugador extends Personajes {
    double experiencia = 0;
    String clase = "";
    int dinero = 0;
    
    public double getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(double experiencia){
        this.experiencia = experiencia;
    }
    
    public int getDinero(){
        return dinero;
    }
    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    
    public String getClase(){
        return clase;
    }
    public void setClase(String clase){
        this.clase = clase;
    }
}
