package entity;

import entity.composite.AbstractTextComposite;

public class PunctuationMark extends AbstractTextComposite {
    String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String compose() {
        return punctuationMark;
    }
}
