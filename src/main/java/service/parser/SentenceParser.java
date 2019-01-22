package service.parser;

import entity.Paragraph;
import entity.PunctuationMark;
import entity.Sentence;
import entity.composite.AbstractTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends ParserImpl {
    private final String PARSE_TO_WORD_AND_PUNCT = "\\p{Punct}|[\\S&&\\P{Punct}]+";
    private final String PARSE_TO_PUNCT = "\\p{Punct}";
    @Override
    public AbstractTextComponent parse(String sentence) {
        Pattern pattern = Pattern.compile(PARSE_TO_WORD_AND_PUNCT);
        Matcher matcher = pattern.matcher(sentence);
        AbstractTextComponent newSentence = new Sentence();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String word = sentence.substring(start, end);
            if(word.matches(PARSE_TO_PUNCT)){
                newSentence.addComponent(new PunctuationMark(word));
            }
            else {
                newSentence.addComponent(next.parse(word));
            }
        }
        return newSentence;
    }
}
