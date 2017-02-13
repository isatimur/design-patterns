package xyz.isatimur.knowledgebase.design.patterns.decorator;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by isati on 13.02.2017.
 */
public class TextTest {

    @Test
    public void testText() throws IOException {
        final Text text = new PrintableText(new TextInFile(new File("./decorator.txt")));
        String content = text.read();
        assertEquals(content, "my decorator");
    }
}