package com.cromero.rest.ws.restfulwebservices.resource;

import com.cromero.rest.ws.restfulwebservices.dto.DynamicFilteringBean;
import com.cromero.rest.ws.restfulwebservices.dto.StaticFilteringBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DynamicFilteringResource {

    @GetMapping(path = "/dynamic-filtering")
    public MappingJacksonValue filtering() {
        DynamicFilteringBean bean = new DynamicFilteringBean("value1", "value2", "value3", "value4", "value5");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("MyDynamicFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping(path = "/dynamic-filtering-list")
    public MappingJacksonValue filteringList() {
        List<DynamicFilteringBean> beans = Arrays.asList(new DynamicFilteringBean("value1", "value2", "value3", "value4", "value5"),
                new DynamicFilteringBean("value6", "value7", "value8", "value9", "value10"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(beans);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field4","field5");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("MyDynamicFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

}
