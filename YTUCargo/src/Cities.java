import java.util.Map;
import java.util.TreeMap;


public class Cities {
    final Map<String, Integer> map = new TreeMap<String, Integer>   (String.CASE_INSENSITIVE_ORDER);
    public Cities() {

        map.put("Adana", 0);
        map.put("Adıyaman", 1);
        map.put("Afyonkarahisar", 2);
        map.put("Ağrı", 3);
        map.put("Amasya", 4);
        map.put("Ankara", 5);
        map.put("Antalya", 6);
        map.put("Artvin", 7);
        map.put("Aydın", 8);
        map.put("Balıkesir", 9);
        map.put("Bilecik", 10);
        map.put("Bingöl", 11);
        map.put("Bitlis", 12);
        map.put("Bolu", 13);
        map.put("Burdur", 14);
        map.put("Bursa", 15);
        map.put("Çanakkale", 16);
        map.put("Çankırı", 17);
        map.put("Çorum", 18);
        map.put("Denizli", 19);
        map.put("Diyarbakır", 20);
        map.put("Edirne", 21);
        map.put("Elazığ", 22);
        map.put("Erzincan", 23);
        map.put("Erzurum", 24);
        map.put("Eskişehir", 25);
        map.put("Gaziantep", 26);
        map.put("Giresun", 27);
        map.put("Gümüşhane", 28);
        map.put("Hakkari", 29);
        map.put("Hatay", 30);
        map.put("Isparta", 31);
        map.put("Mersin", 32);
        map.put("İstanbul", 33);
        map.put("İzmir", 34);
        map.put("Kars", 35);
        map.put("Kastamonu", 36);
        map.put("Kayseri", 37);
        map.put("Kırklareli", 38);
        map.put("Kırşehir", 39);
        map.put("Kocaeli", 40);
        map.put("Konya", 41);
        map.put("Kütahya", 42);
        map.put("Malatya", 43);
        map.put("Manisa", 44);
        map.put("Kahramanmaraş", 45);
        map.put("Mardin", 46);
        map.put("Muğla", 47);
        map.put("Muş", 48);
        map.put("Nevşehir", 49);
        map.put("Niğde", 50);
        map.put("Ordu", 51);
        map.put("Rize", 52);
        map.put("Sakarya", 53);
        map.put("Samsun", 54);
        map.put("Siirt", 55);
        map.put("Sinop", 56);
        map.put("Sivas",57);
        map.put("Tekirdağ", 58);
        map.put("Tokat", 59);
        map.put("Trabzon", 60);
        map.put("Tunceli", 61);
        map.put("Şanlıurfa", 62);
        map.put("Uşak", 63);
        map.put("Van", 64);
        map.put("Yozgat", 65);
        map.put("Zonguldan", 66);
        map.put("Aksaray", 67);
        map.put("Bayburt", 68);
        map.put("Karaman", 69);
        map.put("Kırıkkale", 70);
        map.put("Batman", 71);
        map.put("Şırnak", 72);
        map.put("Bartın", 73);
        map.put("Ardahan", 74);
        map.put("Iğdır", 75);
        map.put("Yalova", 76);
        map.put("Karabük", 77);
        map.put("Kilis", 78);
        map.put("Osmaniye", 79);
        map.put("Düzce", 80);



    }

    public int getCode(String country){
        int cityFound = map.get(country);
        if(country==null){
            cityFound=0;
        }
        return cityFound;
    }
}