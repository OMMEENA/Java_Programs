package files;
import java.io.*;

public class Demofiles {
    public static void main(String[] args) {

        //for file paths
//        try {
//            File f = new File("javafile.txt");
//
//            String absolute = f.getAbsolutePath();
//
//            System.out.println("Original  path: "
//                    + f.getPath());
//            System.out.println("Absolute  path: "
//                    + absolute);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//    }

        // create method
        //public static void myCreate(){
            File f = new File("D:\\om\\Java_Programs\\Wc.txt");
            try {
                f.createNewFile();
                System.out.println(f.exists());
            } catch (IOException e) {
            }


            // file write method
//        public void myWrite () {
            try {
                File fs = new File("D:\\om\\Java_Programs\\Wc.txt");
                FileWriter fe = new FileWriter("Wc.txt", true);
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(100);
                bw.write("1 2 3 4 5 6 7");
                char[] ch1 = {'a', 'b', 'c'};
                bw.write(ch1);
                bw.write("om");
                bw.close();
                bw.close();
                System.out.println();
            } catch (IOException e) {
            }
            try {
                File fs = new File("D:\\om\\Java_Programs\\Wc.txt");

                BufferedReader br = new BufferedReader(new FileReader(f));

                String st;
                while ((st = br.readLine()) != null)
                    System.out.println(st);
            } catch (Exception e) {
            }
        }
    }