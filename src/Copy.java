import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Copy {
    public static void copy(File source, File dest) throws IOException {
        long a = System.currentTimeMillis();
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        long b = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(b - a);
        System.out.print("Time of copy: ");
        DateFormat formatter = new SimpleDateFormat("mm:ss:SSS");
        String dateFormatted = formatter.format(calendar.getTimeInMillis());
        System.out.println(dateFormatted);

    }

    public static void main(String[] args) throws IOException {
        File f1 = new File("source.txt");
        File f2 = new File("dest.txt");
        copy(f1, f2);
    }
}



