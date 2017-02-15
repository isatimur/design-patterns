package xyz.isatimur.knowledgebase.design.patterns.decorator;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by isati on 13.02.2017.
 */
public class TextTest {

    @Test
    public void testText() throws IOException {
        File f = new File("./decorator.txt");
        assertTrue(f.exists());

        final Text text = new PrintableText(new TextInFile(f));
        String content = text.read();
        assertEquals(content, "my decorator");
    }
}