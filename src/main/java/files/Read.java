package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {

//    file read method
    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\RAM\\Downloads\\om\\meenaji.txt");
//
//        BufferedReader br = new BufferedReader(new FileReader(f));
//
//        String st;
//        while ((st = br.readLine()) != null)
//            System.out.println(st);
//    }
//}

    File f = new File("C:\\Users\\RAM\\Downloads\\om\\meenaji.txt");
        FileReader fe = new FileReader(f);
        System.out.println(fe.read());

        char[] ch = new char[(int)(f.length())];
        fe.read(ch);

        for (int i = 0 ; i <=10 ; i++)
        {
            System.out.println(ch);
        }
        System.out.println("name of my brothers");
    }
}
