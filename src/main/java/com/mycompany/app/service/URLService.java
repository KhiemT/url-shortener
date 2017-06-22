package com.mycompany.app.service;

import com.mycompany.app.api.dto.URLShortenerDTO;

public interface URLService {
	URLShortenerDTO saveUrl(String originalURL);
	URLShortenerDTO getURL(String shortenedURL);
}
