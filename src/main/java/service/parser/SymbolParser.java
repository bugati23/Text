package service.parser;

import entity.Symbol;
import entity.composite.AbstractTextComponent;

public class SymbolParser extends ParserImpl {
    @Override
    public AbstractTextComponent parse(String symbol) {
        return new Symbol(symbol.charAt(0));
    }
}
