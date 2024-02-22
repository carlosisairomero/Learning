package com.cromero.rest.ws.restfulwebservices.resource;

import com.cromero.rest.ws.restfulwebservices.dto.Name;
import com.cromero.rest.ws.restfulwebservices.dto.PersonV1;
import com.cromero.rest.ws.restfulwebservices.dto.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonResource {

    // Versioning by URI

    @GetMapping(path = "/v1/person")
    public PersonV1 getPersonByURI_V1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/v2/person")
    public PersonV2 getPersonByURI_V2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    // Versioning by Request Params

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getPersonByRequestParam_V1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getPersonByRequestParam_V2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    // Versioning by Headers

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonByHeader_V1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonByHeader_V2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    // Versioning by MediaType

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonByMediaType_V1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonByMediaType_V2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

}
