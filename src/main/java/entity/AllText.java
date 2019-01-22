package entity;

import entity.composite.AbstractTextComponent;
import entity.composite.AbstractTextComposite;


public class AllText extends AbstractTextComposite {
    @Override
    public String compose() {
        StringBuilder sb = new StringBuilder();
        for(AbstractTextComponent textComponent : components){
            sb.append(textComponent.compose());
            sb.append("\n");
        }
        return sb.toString();
    }
}
