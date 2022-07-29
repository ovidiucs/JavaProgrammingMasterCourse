public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabyte = kiloBytes / 1024;
            int kiloByteRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabyte + " MB and " +
                                kiloByteRemainder + " KB");
        }

    }

}
