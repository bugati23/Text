package service.sorter;

import entity.AllText;
import entity.composite.AbstractTextComponent;
import entity.composite.AbstractTextComposite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Sort {
    private static final Logger LOGGER = LogManager.getLogger(Sort.class);
    public AbstractTextComponent sort(AbstractTextComposite composite, Comparator comparator) {
        if (composite == null || comparator == null){
            LOGGER.error("Null pointer");
            throw new NoSuchElementException("Null pointer");
        }
        List<AbstractTextComponent> list = composite.getComponents();
        list.sort(comparator);
        AbstractTextComponent result = new AllText();
        for(AbstractTextComponent component : list) {
            result.addComponent(component);
        }
        return  result;
    }
}
