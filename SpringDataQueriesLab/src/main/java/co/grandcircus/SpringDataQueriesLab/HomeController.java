package co.grandcircus.SpringDataQueriesLab;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	private HotelRepository repo;

	@RequestMapping("/")
	public String homePage() {
		return "HomePage";
	}
	
	@PostMapping("/submitsearch")
	public String submitSearch(Model model, @RequestParam String city) {
		
		List<Hotel> results = repo.findByCity(city, Sort.by(Sort.Direction.ASC, "pricePerNight"));
		
		model.addAttribute("results", results);
		model.addAttribute("city", city);
		
		return "SearchResults";
	}
	
}
