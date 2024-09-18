package com.altruist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altruist.entities.Hotel;
import com.altruist.response.ResponseRepo;
import com.altruist.service.HotelService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/hotel")
@Slf4j
public class HotelController {
	@Autowired
private HotelService hotelService;
	@PostMapping("/create-hotel")
	public ResponseEntity<ResponseRepo> createHotel(@RequestBody Hotel hotel){
		ResponseRepo createHotel = hotelService.createHotel(hotel);
		return ResponseEntity.ok(createHotel);
		
	}
	@DeleteMapping("/delete-hotel/{hotelId}")
	public ResponseEntity<ResponseRepo> deleteHotel(@PathVariable String hotelId){
		ResponseRepo createHotel = hotelService.deleteHotel(hotelId);
		return ResponseEntity.ok(createHotel);
		
	}
	@PutMapping("/update-hotel")
	public ResponseEntity<ResponseRepo> updateHotel(@RequestBody Hotel hotel){
		ResponseRepo createHotel = hotelService.updateHotel(hotel);
		return ResponseEntity.ok(createHotel);
		
	}
	@GetMapping("/fetch-hotel/{hotelId}")
	public ResponseEntity<ResponseRepo> fetchHotels(@PathVariable String hotelId){
		ResponseRepo createHotel = hotelService.getHotel(hotelId);
		return ResponseEntity.ok(createHotel);
	}
	@GetMapping("/fetch-hotels")
	public ResponseEntity<ResponseRepo> fetchHotels(){
		ResponseRepo createHotel = hotelService.getHotels();
		return ResponseEntity.ok(createHotel);
	}
}
