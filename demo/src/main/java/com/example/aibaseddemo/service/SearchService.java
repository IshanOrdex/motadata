package com.example.aibaseddemo.service;

import com.example.aibaseddemo.dto.SearchResponseDTO;

public interface SearchService {

	SearchResponseDTO handleSearch(String query);

}
