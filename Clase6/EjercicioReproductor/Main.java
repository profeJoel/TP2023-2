public class Main{
    public static void main(String[] args) {
        Reproductor espotifai = new Reproductor();
        espotifai.guardarCancion(new Cancion("Despacito", "2017", "Fonsi", "Reggeton/POP", 120));
        espotifai.guardarCancion(new Cancion("Master of Puppets", "Master of Puppets", "Metallica", "Thrash Metal", 420));
        espotifai.guardarCancion(new Cancion("Black Sabbat", "Black Sabbat", "Black Sabbat", "Thrash Metal", 300));

        //espotifai.reproducirCancion();
        espotifai.reproducirLista();
    }
}