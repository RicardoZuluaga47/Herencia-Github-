package herencia.github;
public class Enemigos extends Personajes {
    private String raza = "";
    private boolean jefe;
    private int recompensa = 0;
    
    public int getRecompensa(){
        return recompensa;
    }
    public void setRecompensa(int recompensa){
        this.recompensa = recompensa;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public boolean getJefe(){
        return jefe;
    }
    public void setJefe(boolean jefe){
        this.jefe = jefe;
    }
}
