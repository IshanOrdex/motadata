package com.example.aibaseddemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aibaseddemo.dto.SearchRequestDTO;
import com.example.aibaseddemo.dto.SearchResponseDTO;
import com.example.aibaseddemo.service.SearchService;

@RestController
@RequestMapping("/rest/search/content")
public class SearchController {
	
		private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
		@Autowired
	    private SearchService searchService;

	    @PostMapping("/")
		public SearchResponseDTO search(@RequestBody SearchRequestDTO searchRequestDTO) {

			LOGGER.info("Entering SearchController -> search query Method");

			return searchService.handleSearch(searchRequestDTO.getQuery());

		}

}
