package scraperweb;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseLinksExample {

	public static void main(String[] args) {
		
		Document doc;
	    try {

	        doc = Jsoup.connect("https://artenhilo.cl/shop/"+ "/")	        
	        .userAgent("\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36\"")
            .timeout(1000*10)
            .ignoreHttpErrors(true) 
            .get();

	        // get title of the page
	        String title = doc.title();
	        System.out.println("Title: " + title);

	        // get all links
	        Elements links = doc.select("a[href]");
	        for (Element link : links) {

	            // get the value from href attribute
	            System.out.println("\nLink : " + link.attr("href"));
	            System.out.println("Text : " + link.text());
	            
	         
	        }
	        
	        //get all price
	        
	        Elements text = doc.select("div[id=div.BxCgPce]");
	        for (Element link : links) {

	            // get the value from href attribute
	            System.out.println("\nLink : " + link.attr("href"));
	            System.out.println("Text : " + link.text());
	            
	         
	        }
	        

	        // por si lanza alguna excepcion cuando recibe un error http
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}

}
