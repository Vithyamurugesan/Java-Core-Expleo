package stringlevel1;

public class SanitizeLog {

    public static void main(String[] args) {

        String log = "User=Richard; Password=ricadmin@123; IP=192.168.1.1; Status=SUCCESS";

        // Mask password
        log = log.replaceAll("Password=[^;]*", "Password=********");

        // Redact IP address
        log = log.replaceAll("\\d+\\.\\d+\\.\\d+\\.\\d+", "xxx.xxx.xxx.xxx");

        System.out.println(log);
    }
}