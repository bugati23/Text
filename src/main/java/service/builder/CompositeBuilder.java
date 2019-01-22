package service.builder;


import entity.composite.AbstractTextComponent;
import service.parser.ParserImpl;
import service.reader.ReaderException;
import service.reader.ReaderFromFile;

public class CompositeBuilder {
    public AbstractTextComponent build(String filePath, ParserImpl parser) throws ReaderException {
        //ExpressionCounterInText expCount = new ExpressionCounterInText();
        //text = expCount.count(text);
        ReaderFromFile readerFromFile = new ReaderFromFile();
        AbstractTextComponent textComposite;
        textComposite = parser.parse(readerFromFile.readFile(filePath));
        return textComposite;
    }
}
