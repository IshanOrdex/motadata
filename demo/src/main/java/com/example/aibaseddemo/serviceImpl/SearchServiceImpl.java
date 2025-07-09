package com.example.aibaseddemo.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aibaseddemo.dao.InformationDAO;
import com.example.aibaseddemo.dto.SearchResponseDTO;
import com.example.aibaseddemo.entity.Information;
import com.example.aibaseddemo.service.SearchService;
import com.example.aibaseddemo.util.AILogicSimulator;

@Service
public class SearchServiceImpl implements SearchService{

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchServiceImpl.class);
	
	@Autowired
	private InformationDAO informationDAO;
	
	
//	private final List<Information> knowledgeBase = List.of(
//		    new Information(1, "Reset Password", "To reset your password, go to the login page and click 'Forgot Password'."),
//		    new Information(2, "VPN Issues", "Check if your VPN software is updated and restart your computer."),
//		    new Information(3, "Email Not Syncing", "Ensure your email client is connected to the internet and restart the app."),
//		    new Information(4, "Blue Screen Error", "A blue screen often indicates hardware or driver issues. Run diagnostics."),
//		    
//		    new Information(5, "What is Artificial Intelligence?", "AI is the simulation of human intelligence in machines that are programmed to think and learn."),
//		    new Information(6, "Machine Learning vs Deep Learning", "Machine Learning uses algorithms to parse data, learn from it, and make decisions. Deep Learning is a subset of ML using neural networks."),
//		    new Information(7, "AI in Cybersecurity", "AI helps detect threats faster and can automate security tasks."),
//		    new Information(8, "Future of AI", "AI is expected to impact every industry from healthcare to finance through automation and intelligent decision-making.")
//		);
	
	@Override
	public SearchResponseDTO handleSearch(String query) {
		
		LOGGER.info("In SearchServiceImpl -> search query Method");
		
		List<Information> dataList = informationDAO.findAll();
				
		LOGGER.info("Exiting SearchServiceImpl -> search query Method");
		
		return AILogicSimulator.processQuery(query, dataList);
		
	}
	
	

}
