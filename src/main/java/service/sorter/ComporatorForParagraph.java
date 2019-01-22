package service.sorter;

import entity.composite.AbstractTextComposite;
import java.util.Comparator;

public class ComporatorForParagraph implements Comparator<AbstractTextComposite> {
    @Override
    public int compare(AbstractTextComposite o1, AbstractTextComposite o2) {
        return o1.getComponents().size() - o2.getComponents().size();
    }
}
