package com.unidev.parsers.controller;

import com.unidev.parsers.service.ParsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
