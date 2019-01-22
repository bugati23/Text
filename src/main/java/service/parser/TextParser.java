package service.parser;

import entity.AllText;
import entity.Paragraph;
import entity.composite.AbstractTextComponent;
import service.reader.ReaderException;
import service.reader.ReaderFromFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser extends ParserImpl {
    private final String PARSE_TO_PARAGRAPH = "\r\n|\\Z";

    @Override
    public AbstractTextComponent parse(String text) {
        Pattern pattern = Pattern.compile(PARSE_TO_PARAGRAPH);
        Matcher matcher = pattern.matcher(text);
        AbstractTextComponent allText = new AllText();
        int start = 0;
        while (matcher.find()) {
            int end = matcher.end();
            String paragraphStr = text.substring(start, end);
            allText.addComponent(next.parse(paragraphStr));
            start = end;
        }
        return allText;
    }
}
