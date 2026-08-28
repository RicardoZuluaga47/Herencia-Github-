package herencia.github;
public class Personajes {
    private double vida = 0;
    private int nivel = 0;
    private String nombre = "";
    private double daño = 0;
    
    public double getVida(){
        return vida;
    }
    public void setVida(double vida){
        this.vida = vida;
    }
    
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getDaño(){
        return daño;
    }
    public void setDaño(double daño){
        this.daño = daño;
    }
}
