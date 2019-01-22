package entity.composite;

public abstract class AbstractTextComponent {
    public void addComponent(AbstractTextComponent textComponent){
        throw new UnsupportedOperationException();
    }
    public void removeComponent(AbstractTextComponent textComponent){
        throw  new UnsupportedOperationException();
    }
    public abstract String compose();
}
