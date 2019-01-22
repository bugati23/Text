package sorter;

import entity.AllText;
import entity.Paragraph;
import entity.Sentence;
import entity.composite.AbstractTextComponent;
import entity.composite.AbstractTextComposite;
import org.junit.Test;
import service.sorter.ComporatorForParagraph;
import service.sorter.Sort;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void sort(){
        Comparator<AbstractTextComposite> comp= new ComporatorForParagraph();
        Sort sorter = new Sort() ;
        AbstractTextComponent s1 = new Sentence();
        AbstractTextComponent s2 = new Sentence();
        AbstractTextComponent s3 = new Sentence();
        AbstractTextComponent s4 = new Sentence();
        AbstractTextComponent s5 = new Sentence();
        AbstractTextComponent s6 = new Sentence();
        AbstractTextComponent p1 = new Paragraph();
        AbstractTextComponent p2 = new Paragraph();
        AbstractTextComponent p3 = new Paragraph();
        AbstractTextComposite text = new AllText();
        AbstractTextComposite tExpected = new AllText();
        p1.addComponent(s1);
        p1.addComponent(s2);
        p2.addComponent(s3);
        p2.addComponent(s4);
        p2.addComponent(s5);
        p3.addComponent(s6);
        text.addComponent(p1);
        text.addComponent(p2);
        text.addComponent(p3);
        tExpected.addComponent(p3);
        tExpected.addComponent(p1);
        tExpected.addComponent(p2);
        AbstractTextComponent component = sorter.sort(text,comp);
        assertEquals(tExpected, component);
    }
}
