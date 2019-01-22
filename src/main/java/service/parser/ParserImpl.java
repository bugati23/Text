package service.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ParserImpl implements Parser {
    protected Parser next;
    protected static final Logger LOGGER = LogManager.getLogger(ParserImpl.class);
    @Override
    public ParserImpl setNext(ParserImpl next) {
        this.next = next;
        return next;
    }
}
