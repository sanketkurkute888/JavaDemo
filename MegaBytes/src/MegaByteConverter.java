public class MegaByteConverter {

    public void printMegaBytesAndKiloBytes(int kiloBytes )
    {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        }
        else
        System.out.println(kiloBytes +" KB = "+kiloBytes/1024+" MB and "+kiloBytes%1024+" KB");

    }
}
