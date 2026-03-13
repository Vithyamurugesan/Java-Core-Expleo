package filehandlinglevel1;
import java.io.File;
import java.util.Date;
public class LastModifiedTime {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt");
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("Last Modified Time: " + d);

    }
}
