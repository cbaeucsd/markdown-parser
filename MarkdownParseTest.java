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

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of
        ("C:\\Users\\Chan\\Documents\\GitHub\\markdown-parser\\test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com","some-thing.html"),
        MarkdownParse.getLinks(content));
        
    }
}