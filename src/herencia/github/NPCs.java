package herencia.github;
public class NPCs extends Personajes {
    String profecion = "";
    boolean interaccion;
    int amistad = 0;
    
    public int getAmistad(){
        return amistad;
    }
    public void setAmistad(int amistad){
        this.amistad = amistad;
    }
    
    public String getProfecion(){
        return profecion;
    }
    public void setProfecion(String profecion){
        this.profecion = profecion;
    }
    
    public boolean getInteraccion(){
        return interaccion;
    }
    public void setInteraccion(boolean interaccion){
        this.interaccion = interaccion;
    }
}
