package kg.megacom;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Document doc;
        try {
            doc =Jsoup.connect("https://www.nbkr.kg/").get();
            Elements words = doc.select("h3[class=name]");
            System.out.println(words.text());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}