package com.example.aibaseddemo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SearchResponseDTO {
	
	private String aiSummaryAnswer;
    private List<String> matchedArticles;

}
