import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    public Playlist(){
        favoriteSongs[0]= "Ferxxo-100";
        favoriteSongs[1]= "Maluma- Cosas Pendientes";
        favoriteSongs[2]= "Diomedes Diaz- Sin Medir Distancia";
        favoriteSongs[3]= "Camilo- Favorito";
        favoriteSongs[4]= "kaleth- Siete Palabras";
        favoriteSongs[5]= "Manuel Turizo- En Privado";
        favoriteSongs[6]= "Manuel Turizo- Quiereme Mientras Se Pueda";
        favoriteSongs[7]= "Silvestre Dangon- Habla con ella";
        favoriteSongs[8]= "Silvestre Dangon- Del Ahogao el Sombrero";
        favoriteSongs[9]= "Enrrique Iglesias- Bailando";

//   songs for desert Island
        desertIslandPlaylist.add("Camilo- La Boka");
        desertIslandPlaylist.add("Diomedes Diaz- Sueños y Vivencias");
        desertIslandPlaylist.add("MR Car- El Motel");
        desertIslandPlaylist.add("J Balvin- Rio");
        desertIslandPlaylist.add("Manuel Turizo- Besame");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.remove("Camilo- La Boka");
        desertIslandPlaylist.remove(8);
        desertIslandPlaylist.remove("J Balvin- Rio");
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove("Diomedes Diaz- Sueños y Vivencias");
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(1);

        int songA = desertIslandPlaylist.indexOf("Manuel Turizo- Besame");
        int songB = desertIslandPlaylist.indexOf("Enrrique Iglesias- Bailando");

        String tempA = desertIslandPlaylist.get(songA);
        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);



    }
    public void playSongs(){
        System.out.println("Fired three songs of favorite list");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert Island");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

    }
}
