package com.brs.sun.api;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/clova")
public class ClovaOcrController {

	private final ClovaOcrService service;
	
	@PostMapping
	public Map<String, Object> test(@RequestParam MultipartFile image) throws IOException{
		return service.recognizeText(image);
	}

}
