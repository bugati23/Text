package service.parser;

import entity.Word;
import entity.composite.AbstractTextComponent;

public class WordParser extends ParserImpl {
    @Override
    public AbstractTextComponent parse(String word) {
       AbstractTextComponent newWord = new Word();
       char[] characters = word.toCharArray();
       for(Character character : characters){
           newWord.addComponent(next.parse(String.valueOf(character)));
       }
       return newWord;
    }
}
