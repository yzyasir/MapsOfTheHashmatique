import java.util.Set;
public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Again", "Ayamaranakucha ikenai yo ne Ah, Gomen ne Umaku ienakute Shinpai kaketa mama datta ne");
        userMap.put("Blue Bird", "Habataitara modoranai to itte Mezashita no wa aoi aoi ano sora");
        userMap.put("Tane wo Maku Hibi", "Dakedo itsudemo jibun no shinjite Kawaru jidai no naka, kawarazu ni iretara");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}