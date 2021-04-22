package Tugas2_Televisi;
/**
 *
 * @author ACER
 */
public class Televisi {
    String deskripsi = "";
    int jumlahChannel = 0;
    String[] channels = new String[jumlahChannel];
    int channelAktif = 0;
    int volume = 0;
    String pembeli = "";
    
    // constructor (Method Khusus)
    Televisi(final String p, final String deskripsi, final int jumlahChannel) {
        this.pembeli = p;
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    // set deskripsi
    public void getDeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    // set channel
    public void setChannels(String[] channels) {
        if (channels.length > this.jumlahChannel) {
            System.out.println("Maaf Tv ini hanya dapat menyimpan " + this.jumlahChannel + " channel");
        } else {
            this.channels = channels;
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    // get channel aktif
    public void getChannels() {
        if(this.channels.length == 0) {
            System.out.println("Belum ada channel yang diset!");
        } else {
            String data = "";
            for (String channel : this.channels) {
                data += channel + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    // set channel aktif
    public void setChannelAktif(int e) {
        this.channelAktif = e;
        int data = e;
        System.out.println("Pindah ke channel : " + this.channels[e-1]);
    }
    
    // set volume
    public void setVolume(int v) {
        System.out.println("Intensitas volume sekarang : " + v);
    }
    
    
}
class User {
    public static void main(String[] args) {
        
        Televisi Rafli = new Televisi("Rafli telah", "televisi baru LG, 12 inch", 10);
        String[]  Channel = {"SCTV", "AN TV", "TV ONE", "RCTI", "Global Tv",
                             "Kompas Tv", "Ruwet Tv", "JTV", "Lumajang Tv", 
                             "Trans Tv"};
            
        Rafli.getDeskripsi();
        Rafli.getChannels();
        Rafli.setChannels(Channel);
        
        Rafli.setChannelAktif(7);
        Rafli.setVolume(87);
        Rafli.setChannelAktif(10);
        
    }
}
