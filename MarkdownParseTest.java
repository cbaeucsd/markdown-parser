import static org.junit.Assert.*; //these two lines import the testing framework
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest { //name of test class
    @Test //lets framework know this is a test method
    public void addition() { //name denotes we are testing addition
        assertEquals(2, 1 + 1); //tests if 2 = 1 + 1
    }
/*
    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of
        ("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com","some-thing.html"),
        MarkdownParse.getLinks(content));      
    }
    @Test
    public void testBreak2() throws IOException{
        Path fileName = Path.of
        ("testbreak2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(""),
        MarkdownParse.getLinks(content));      
    }
    @Test
    public void testBreak3() throws IOException{
        Path fileName = Path.of
        ("testbreak3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("link2"),
        MarkdownParse.getLinks(content));      
    }
    @Test
    public void testallTestFiles() throws IOException{
        Path fileName = Path.of
        ("test-file2.md");
        Path fileName1 = Path.of
        ("test-file3.md");
        Path fileName2 = Path.of
        ("test-file4.md");
        Path fileName3 = Path.of
        ("test-file5.md");
        Path fileName4 = Path.of
        ("test-file6.md");
        Path fileName5 = Path.of
        ("test-file7.md");
        Path fileName6 = Path.of
        ("test-file8.md");
        String content = Files.readString(fileName);
        String content2 = Files.readString(fileName1);
        String content3 = Files.readString(fileName2);
        String content4 = Files.readString(fileName3);
        String content5 = Files.readString(fileName4);
        String content6 = Files.readString(fileName5);
        String content7 = Files.readString(fileName6);
        assertEquals(List.of("https://something.com", "some-page.html"),
        MarkdownParse.getLinks(content));      
        assertEquals(List.of(),
        MarkdownParse.getLinks(content2));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content3));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content4));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content5));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content6));  
        assertEquals(List.of("a link on the first line"),
        MarkdownParse.getLinks(content7));  
    }
    */
     @Test
    public void testotherFiles() throws IOException{ //test files from other repositories 
        Path fileName = Path.of
        ("Incomplete.md");
        Path fileName1 = Path.of
        ("Empty.md");
        Path fileName2 = Path.of
        ("farapart.md");
        Path fileName3 = Path.of
        ("Test3.md");
        Path fileName4 = Path.of
        ("Test1.md");
        Path fileName5 = Path.of
        ("Test2.md");
        String content = Files.readString(fileName);
        String content2 = Files.readString(fileName1);
        String content3 = Files.readString(fileName2);
        String content4 = Files.readString(fileName3);
        String content5 = Files.readString(fileName4);
        String content6 = Files.readString(fileName5);
        assertEquals(List.of("https://google.com"),
        MarkdownParse.getLinks(content));      
        assertEquals(List.of("https://google.com", "https://google.com"),
        MarkdownParse.getLinks(content2));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content3));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content4));  
        assertEquals(List.of("http://nbastreams.site","https://www.markdownguide.org/basic-syntax/"),
        MarkdownParse.getLinks(content5));  
        assertEquals(List.of(),
        MarkdownParse.getLinks(content6));  

    }
}