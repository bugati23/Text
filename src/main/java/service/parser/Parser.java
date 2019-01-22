package service.parser;

import entity.composite.AbstractTextComponent;


public interface Parser {
    Parser setNext(ParserImpl parser);
    AbstractTextComponent parse(String value);
}
