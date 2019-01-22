package service.parser;

import entity.Paragraph;
import entity.composite.AbstractTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends ParserImpl {
    private final String PARSE_TO_SENTENCES = "([^(\\.|!|\\?)]+)(\\.|!|\\?)";

    @Override
    public AbstractTextComponent parse(String paragraph) {
        Pattern pattern = Pattern.compile(PARSE_TO_SENTENCES);
        Matcher matcher = pattern.matcher(paragraph);
        AbstractTextComponent sentences = new Paragraph();
        int start = 0;
        while (matcher.find()) {
            int end = matcher.end();
            String sentence = paragraph.substring(start, end);
            sentences.addComponent(next.parse(sentence));
            start = end;
        }
        return sentences;
    }
}
