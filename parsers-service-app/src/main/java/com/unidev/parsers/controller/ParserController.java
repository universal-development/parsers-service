package com.unidev.parsers.controller;

import com.unidev.parsers.model.Parser;
import com.unidev.parsers.model.ParserRequest;
import com.unidev.parsers.model.ParserResponse;
import com.unidev.parsers.service.ParsersService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ParserController {

    @Autowired
    private ParsersService parsersService;

    @GetMapping("parsers")
    public List<String> fetch() {
        return parsersService.parserIds();
    }

    @PostMapping("parser/{id}")
    public Mono<ParserResponse> parser(@PathVariable("id") String id, @RequestBody ParserRequest parserRequest) {
        Optional<Parser> parser = parsersService.fetchParser(id);
        if (!parser.isPresent()) {
            throw new ParserNotFoundException();
        }
        return Mono.just(parser.get().process(parserRequest));
    }


}
