package faktorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Praktikan
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tinggi, setengahTinggi;
String input = null;
System.out.print("Masukkan tinggi: ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Faktorial.class.getName()).log(Level.SEVERE, null, ex);
        }
tinggi = Integer.parseInt(input);

int l = 1;
int n = tinggi/2;
System.out.println();
System.out.println("output: ");
for(int i=1;i<=n;i++){
for(int k=n;k>i;k--){
System.out.print(" ");
}
for(int j=1;j<=l;j++){
System.out.print("*");
}
l+=2;

System.out.println("");
}
l -= 4;

for(int i=(n-1);i>=1;i--){
for(int k=i;k<=(n-1);k++){
System.out.print(" ");
}
for(int j=l;j>=1;j--){
System.out.print("*");
}
l-=2;

System.out.println("");
}

}
    }

