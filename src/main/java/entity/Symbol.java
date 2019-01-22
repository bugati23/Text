package entity;

import entity.composite.AbstractTextComponent;

public class Symbol extends AbstractTextComponent {
    private Character symbol;
    public Symbol(Character character){
        symbol = character;
    }
    @Override
    public String compose() {
        return symbol.toString();
    }
}
