import java.util.Scanner;
interface Searchable {
    // Declare the abstract method "search" that classes implementing this interface must provide
    boolean search(String keyword);
}
class Document implements Searchable {
    private String content;

    // Constructor to initialize the document content
    public Document(String content) {
        this.content = content;
    }

    // Implement the search method to look for a keyword in the document
    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

// Implement the WebPage class which represents a web page
class WebPage implements Searchable {
    private String url;
    private String content;

    // Constructor to initialize the URL and content of the webpage
    public WebPage(String url, String content) {
        this.url = url;
        this.content = content;
    }

    // Implement the search method to look for a keyword in the web page content
    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}
public class W05_P2 {
    public static void main(String[] args) {
        // Create an instance of the Document class with a sample content
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String document = text;
        String str = in.nextLine();

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.contains(str);

        // Print whether the document contains the keyword
        System.out.println("Document contains keyword: " +str+ " "+documentContainsKeyword);
// Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://onlinecourses.nptel.ac.in", "This is a NPTEL online course webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        // Print whether the webpage contains the keyword
        System.out.print("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}