package uz.zako.begin;

import java.io.*;

public class FileParser {

    public static void main(String[] args) throws IOException {

        File inFile = new File("input/STDPRICE_FULL.TXT");
        File outFile = new File("output/STDPRICE_FULL.CSV");

        FileWriter fw = new FileWriter(outFile);
        BufferedWriter writer = new BufferedWriter(fw);

        FileReader fileReader = new FileReader(inFile);
        BufferedReader reader = new BufferedReader(fileReader);

        String s = "";

        while ((s = reader.readLine()) != null) {
            s = s.replaceAll(",", ";");
            writer.write(s);
            writer.newLine();
            writer.flush();
        }

        writer.close();

    }

}
