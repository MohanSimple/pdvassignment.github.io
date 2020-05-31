package com.pdvtechnocrats.Details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DetailsController {

	@Autowired
	private DetailsRepository detailsRepository ;
	
	@GetMapping("/details")
	public ResponseEntity<List<Details>> getDetails(){
		List<Details> list = new ArrayList<Details>();
		try {
			detailsRepository.findAll().forEach(list::add);
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PostMapping("/details")
	public ResponseEntity<Details> addDetails(@RequestBody Details details){
		try {
			Details _detail =detailsRepository.save(new Details(details.getName(),details.getDemographic(),details.getSource(), details.getAddedBy(), details.getDate(), details.getSet(), details.getNums(), details.getDetails()));
			return new ResponseEntity<>(_detail, HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@DeleteMapping("/details/{id}")
	public ResponseEntity<HttpStatus> deleteDetails(@RequestBody Details details, @PathVariable int id){
		try {
			detailsRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
}
