/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import dictionary.Dictionary;
import java.util.List;
import stemmerindonesia.Stemmer;
/**
 *
 * @author PUTRI
 */
public class StemmerIndonesiaMain {
    
/**
     * @param args the command line arguments
     * @throws java.lang.Exception dictionary not found
     */
    public static void main(String[] args) throws Exception {
        //contoh penggunaannya        
//        List dictionary = new Dictionary().read().getDictionaryData();
        List dictionary = new Dictionary().read("src/dictionary/dictionaries.properties").getDictionaryData(); //use specific path
        Stemmer stemmer = new Stemmer(dictionary);
        String word1 = "Pendidikan karakter di beberapa negara sudah mendapatkan prioritas sejak pendidikan dasar dimulai.\n" +
"Namun di Indonesia, pendidikan karakter masih dipandang sebagai wacana dan belum menjadi bagian yang\n" +
"terintegrasi dalam pendidikan formal. Artikel ini membahas tentang pentingnya pendidikan karakter dalam\n" +
"sistem pendidikan formal. Dimulai dengan melihat contoh manfaat pendidikan karakter di negara lain\n" +
"seperti Amerika dan Cina. Kemudian, dilanjutkan dengan usaha-usaha yang dilakukan oleh Jurusan Teknik\n" +
"Industri UK Petra untuk merancang pendidikan karakter yang sistematis dan terintegrasi dalam kurikulum\n" +
"bagi mahasiswa sebagai persiapan menuju ke dunia kerja. Usaha tersebut antara lain penetapan pendidikan\n" +
"karakter sebagai salah satu rencana strategis jurusan, penetapan tim, perancangan dan pelaksanaan program\n" +
"pendidikan karakter, evaluasi, serta usaha perbaikan terus menerus.";
        
        
        println("\nParagraf 1: " + word1 + ":");
         for (String word : word1.split(" ")) {
             word = removeCharacter(word);
            println("\t" + word + " = " + stemmer.getRootWord(word));
         }
    }

    static String removeCharacter(String word) {
        //feel free to add special character that you need to remved
        return word.replaceAll("[-+.^:,]", "");
    }

    static void println(String mssg) {
        System.out.println(mssg);
    }
}
