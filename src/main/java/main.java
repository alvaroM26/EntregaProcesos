import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main (String [] args) throws IOException {
        hacerDirDoble();
    }

    private static void hacerDirDoble() throws IOException {

            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\\" && dir");

            builder.redirectErrorStream(true);

            Process p = builder.start();

            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {
                    System.out.println(line);
            }

        }

    }