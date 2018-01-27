package com.unidev.parsers.model;

/**
 * Parser service implementation.
 */
public interface Parser {

    /**
     * Parser id.
     */
    String parserId();

    /**
     * Process request.
     */
    ParserResponse process(ParserRequest parserRequest);

}
