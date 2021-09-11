public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megapart = 0;
            int kilopart = 0;
            if (kiloBytes >= 1024) {
                megapart = kiloBytes / 1024;
                kilopart = kiloBytes - 1024*megapart;
            } else {
                megapart = 0;
                kilopart = kiloBytes;
            }
            System.out.println(kiloBytes + " KB = " + megapart + " MB and " + kilopart + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(1024);
    }
}
