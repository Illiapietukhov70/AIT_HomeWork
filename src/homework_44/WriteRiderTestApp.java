package homework_44;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WriteRiderTestApp {
    public static void main(String[] args) throws IOException {
        //Task1
        File inputFile = new File("src/homework_44/text.txt");
        writeTextFile(inputFile);
        //Task2
        File paymentFile = new File("src/homework_44/payment_input.txt");
        paymentSeparator(paymentFile);

    }
    public static void writeTextFile(File file) throws IOException {
        File fileCopy = new File("src/homework_44/copy.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy, false));
            BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
        }
    }
    public static void paymentSeparator(File file) throws IOException {
        Map<String, Double> accounts = new HashMap<>();
        File fileLess = new File("src/homework_44/less.txt");
        File fileMore = new File("src/homework_44/more.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bwLess = new BufferedWriter(new FileWriter(fileLess, false));
             BufferedWriter bwMore = new BufferedWriter(new FileWriter(fileMore, false));){
                 String line;
                 while ((line = br.readLine()) != null) {
                     String[] elems = line.split(":");
                     accounts.merge(elems[0], Double.parseDouble(elems[1]), (a, b) -> a + b);
                 }
                 for (Map.Entry<String, Double> entry : accounts.entrySet()) {
                     if (entry.getValue() < 2000) {
                         bwLess.write(entry.getKey() + ":" + entry.getValue() + "\n");
                     } else {
                         bwMore.write(entry.getKey() + ":" + entry.getValue() + "\n");
                     }
                 }
        }
    }
}
