package herencia.github;
public class HerenciaGithub {
public static void main(String[] args) {
    Jugador player = new Jugador();
    Enemigos enemigo1 = new Enemigos();
    NPCs herrero = new NPCs();
    
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
    
    herrero.setNombre("Wilex");
    herrero.setProfecion("Herrero");
    herrero.setInteraccion(true);
    herrero.setNivel(30);
    herrero.setVida(200);
    herrero.setDaño(32.41);
    herrero.setAmistad(50);
    
    System.out.println("Estadisticas de "+player.getNombre()+":");
    System.out.println("Vida: "+player.getVida()+"   |   Dano: "+player.getDaño());
    System.out.println("Clase: "+player.getClase()+"   |   Nivel: "+player.getNivel());
    System.out.println("XP: "+player.getExperiencia()+"   |   Dinero: "+player.getDinero());
    System.out.println("-------------------------------------------------------------------");
    
    System.out.println("Estadisticas de "+herrero.getNombre()+":");
    System.out.println("Vida: "+herrero.getVida()+"   |   Dano: "+herrero.getDaño());
    System.out.println("Profecion: "+herrero.getProfecion()+"   |   Nivel: "+herrero.getNivel());
    System.out.println("Interaccion: "+herrero.getInteraccion()+"   |   Amistad: "+herrero.getAmistad());
    System.out.println("-------------------------------------------------------------------");
    
    System.out.println("Estadisticas de "+enemigo1.getNombre()+":");
    System.out.println("Vida: "+enemigo1.getVida()+"   |   Dano: "+enemigo1.getDaño());
    System.out.println("Raza: "+enemigo1.getRaza()+"   |   Nivel: "+enemigo1.getNivel());
    System.out.println("Jefe: "+enemigo1.getJefe()+"   |   Recompensa: "+enemigo1.getRecompensa());
    }
}
