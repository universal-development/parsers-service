package com.unidev.parsers.model;

import org.springframework.stereotype.Component;

@Component
public class TestParser implements Parser {

    @Override
    public String parserId() {
        return "test-parser";
    }

    @Override
    public ParserResponse process(ParserRequest parserRequest) {
        ParserResponse parserResponse = new ParserResponse();
        parserResponse.put("test-key", "test-value");
        return parserResponse;
    }
}
