package xyz.isatimur.knowledgebase.design.patterns.decorator;

import java.io.IOException;

/**
 * Created by isati on 13.02.2017.
 */
public class PrintableText implements Text {
    private final Text origin;

    public PrintableText(final Text origin) {
        this.origin = origin;
    }

    @Override
    public String read() throws IOException {
        return this.origin.read().replace("[^\\p{Print}]", "");
    }
}
