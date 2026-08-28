package herencia.github;
public class HerenciaGithub {
public static void main(String[] args) {
    Jugador player = new Jugador();
    Enemigos enemigo1 = new Enemigos();
    
    player.setNombre("Ricky_47");
    player.setClase("Barbaro");
    player.setNivel(24);
    player.setExperiencia(395.57);
    player.setVida(451);
    player.setDaño(86.63);
    player.setDinero(1542);
    
    enemigo1.setNombre("Karvengor");
    enemigo1.setRaza("Titan de lava");
    enemigo1.setJefe(true);
    enemigo1.setNivel(50);
    enemigo1.setVida(3000);
    enemigo1.setDaño(214.05);
    enemigo1.setRecompensa(1000);
    }
}
