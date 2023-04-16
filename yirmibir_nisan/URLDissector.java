package yirmibir_mart;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

//URL yi  sektörlerine ayıran kod.
//reads url from a file and prints their path components.

public class URLDissector {
    public static void main (String [] args ) throws IOException 
    {
        String url;
        //biri file ı diğeri url yi tarayan 2 nesne obje oluşturduk.
        Scanner file_scan, url_scan;
        file_scan = new Scanner (new File("urls.inp"));
        //read and proccess each line of the file.

        while(file_scan.hasNext()){
            url=file_scan.nextLine();
            System.out.println("URL: "+url);

            url_scan = new Scanner(url);
            //aranacak karakteri ayırıcı olarak belirledik.useDelimiter ile.
            url_scan.useDelimiter("/");

        // print each part of the url

            while(url_scan.hasNext()){

                System.out.println(" " + url_scan.next());
            }
        }
        //ne fark var tab detayı.
        
            System.out.println();
    }
    
}
