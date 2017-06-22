package com.mycompany.app.api;

import com.mycompany.app.api.dto.URLShortenerDTO;

public interface URLResource {
	URLShortenerDTO saveURL(String originalURL);
	URLShortenerDTO getURL(String shortenedURL);
}
