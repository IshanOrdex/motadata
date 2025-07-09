package com.example.aibaseddemo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.aibaseddemo.dto.SearchResponseDTO;
import com.example.aibaseddemo.entity.Information;

public class AILogicSimulator {

	public static SearchResponseDTO processQuery(String query, List<Information> knowledgeBase) {

		String lowerCaseQuery = query.toLowerCase(Locale.ROOT);
		List<String> matchedTitles = new ArrayList<>();
		StringBuilder aiSummary = new StringBuilder();

		for (Information article : knowledgeBase) {
			if (article.getTitle().toLowerCase().contains(lowerCaseQuery)
					|| article.getContent().toLowerCase().contains(lowerCaseQuery)) {
				matchedTitles.add(article.getTitle());
				aiSummary.append("- ").append(article.getContent()).append("\n");
			}
		}

		if (matchedTitles.isEmpty()) {
			return new SearchResponseDTO("No relevant articles found.", List.of());
		}

		return new SearchResponseDTO(aiSummary.toString().trim(), matchedTitles);
	}
	
}
