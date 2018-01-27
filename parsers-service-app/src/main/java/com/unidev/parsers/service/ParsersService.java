package com.unidev.parsers.service;

import com.unidev.parsers.model.Parser;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParsersService {

    private List<Parser> parserList;

    public ParsersService(@Autowired(required = false) List<Parser> parserList) {
        this.parserList = parserList;
    }

    public List<Parser> getParserList() {
        return parserList;
    }

    public Optional<Parser> fetchParser(String id) {
        for(Parser parser : parserList) {
            if (id.equals(parser.parserId())) {
                return Optional.of(parser);
            }
        }
        return Optional.empty();
    }

}
