package com.cromero.rest.ws.restfulwebservices.resource;

import com.cromero.rest.ws.restfulwebservices.dto.StaticFilteringBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFilteringResource {

    @GetMapping(path = "/static-filtering")
    public StaticFilteringBean filtering() {
        return new StaticFilteringBean("value1", "value2", "value3", "value4", "value5");
    }

    @GetMapping(path = "/static-filtering-list")
    public List<StaticFilteringBean> filteringList() {
        return Arrays.asList(new StaticFilteringBean("value1", "value2", "value3", "value4", "value5"),
            new StaticFilteringBean("value6", "value7", "value8", "value9", "value10"));
    }

}
