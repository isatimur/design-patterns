package xyz.isatimur.knowledgebase.design.patterns.decorator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by isati on 13.02.2017.
 */
final class TextInFile implements Text {

    private final File file;

    public TextInFile(final File file) {
        this.file = file;
    }

    @Override
    public String read() throws IOException {
        return new String(Files.readAllBytes(file.toPath()), "UTF-8");
    }
}
