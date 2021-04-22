package Tugas2_Televisi;
/**
 *
 * @author ACER
 */
public class TelevisiModern extends Televisi {
    public TelevisiModern(String p, String deskripsi, int jumlahChannel) {
        super(p, deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "Teletext";
    static String TV = "Televisi";
    
    //    TELETEXT
    
    public void setModusTampilan(String t) {
        this.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TV);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    //    CD
    
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("CD tidak ditemukan");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TelevisiModern Rafli = new TelevisiModern("Rafli telah", "televisi baru Toshiba, 29 inch", 10);
 
        String[] channel = {"SCTV", "AN TV", "TV ONE", "RCTI", "Global Tv",
                            "Kompas Tv", "Ruwet Tv", "JTV", "Lumajang Tv", 
                            "Trans Tv"};
        
        
        Rafli.getDeskripsi();
        Rafli.getChannels();
        Rafli.setChannels(channel);
        
        Rafli.setChannelAktif(3);
        Rafli.setVolume(87);
        Rafli.setChannelAktif(10);
        Rafli.setChannelAktif(1);
        Rafli.setModusTampilan(TelevisiModern.TELETEXT);
        Rafli.setHalamanTeletext(250);
        Rafli.setModusTampilan(TelevisiModern.TV);
        Rafli.playCD();
        Rafli.setDiscTray("Descendants of the Sun");
        Rafli.playCD();
        
    }
}
