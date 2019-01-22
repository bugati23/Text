package builder;


import org.junit.Test;
import service.builder.CompositeBuilder;
import service.parser.*;
import service.reader.ReaderException;

import static org.junit.Assert.assertEquals;

public class CompositeBuilderTest {
    @Test
    public void build() throws ReaderException {
        CompositeBuilder compositeBuilder = new CompositeBuilder();
        String filePath = "src/test/resources/textTest.txt";
        ParserImpl paragraphParser = new ParagraphParser();
        ParserImpl textParser = new TextParser();
        ParserImpl sentenceParser = new SentenceParser();
        ParserImpl wordParser = new WordParser();
        ParserImpl symbolParser = new SymbolParser();
        textParser.setNext(paragraphParser).setNext(sentenceParser).setNext(wordParser).setNext(symbolParser);
        String excpectText = "It has survived - not only ( five ) centuries , but also the leap into electronic typesetting , remaining essentially unchanged . It was popularised in the with the release of Letraset sheets containing Lorem Ipsum passages , and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum . \n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout . The point of using Ipsum is that it has a more - or - less normal distribution of letters , as opposed to using ( Content here ) , content here , making it look like readable English . \n" +
                "It is a established fact that a reader will be of a page when looking at its layout . \n" +
                "Bye .\n";
        assertEquals(compositeBuilder.build(filePath,textParser).compose(),excpectText);
    }
}
