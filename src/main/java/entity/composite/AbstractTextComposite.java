package entity.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractTextComposite extends AbstractTextComponent {
    protected List<AbstractTextComponent> components = new ArrayList<>();
    @Override
    public void addComponent(AbstractTextComponent textComponent) {
        components.add(textComponent);
    }

    @Override
    public void removeComponent(AbstractTextComponent textComponent) {
        components.add(textComponent);
    }

    abstract public String compose();

    public List<AbstractTextComponent> getComponents() {
        return components;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTextComposite that = (AbstractTextComposite) o;
        return Objects.equals(components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }
}
