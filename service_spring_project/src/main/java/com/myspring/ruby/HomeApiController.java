package com.myspring.ruby;

import com.myspring.ruby.com.myspring.ruby.model.TemplateModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by woohyunjo on 2016-05-03.
 */
@RestController
public class HomeApiController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/api/get-template", method = {RequestMethod.GET, RequestMethod.POST})
    public TemplateModel getTemplate(@RequestParam(value = "name") String name) {
        logger.debug("@@@@@ Api Call Template Name {}.", name);

        return new TemplateModel(name);
    }
}