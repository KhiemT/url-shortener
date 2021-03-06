package com.mycompany.app.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.app.api.URLResource;
import com.mycompany.app.api.dto.URLShortenerDTO;
import com.mycompany.app.service.URLService;

@RestController
@RequestMapping("/api/url")
public class URLResourceImpl implements URLResource {
	@Autowired
    private URLService urlService;

    @RequestMapping(value = "/shorten",
            method = RequestMethod.POST,
            produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public URLShortenerDTO saveURL(@RequestParam(value = "originalURL") String originalURL) {
        return urlService.saveUrl(originalURL);
    }
    
    @RequestMapping(value = "/reverse", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public URLShortenerDTO getURL(@RequestParam(value = "shortenedURL") String shortenedURL) {
        return urlService.getURL(shortenedURL);
    }
}
