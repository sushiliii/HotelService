package com.altruist.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altruist.entities.Hotel;
import com.altruist.repository.HotelRepo;
import com.altruist.request.RequestRepo;
import com.altruist.response.ResponseRepo;
import com.altruist.response.StatusDesciption;
import com.altruist.service.HotelService;
import com.altruist.service.utils.ConstantManager;
@Service
public class HotelServiceImpl implements HotelService {
@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public ResponseRepo createHotel(Hotel hotel) {
		ResponseRepo response=new ResponseRepo();
		StatusDesciption desciption=new StatusDesciption();
		response.setStatusDesciption(desciption);
		try {
			String id = UUID.randomUUID().toString();
			hotel.setId(id);
			Hotel hotel2 = hotelRepo.findByHotelId(hotel.getHotelId());
			if(hotel2==null) {
				Hotel hotel3 = hotelRepo.saveAndFlush(hotel);
				response.setHotel(hotel3);
				desciption.setStatusCode(ConstantManager.success.getStatusCode());
				desciption.setStatusDescription(ConstantManager.success.getStatusDescription());
			}
			else {
				desciption.setStatusCode(ConstantManager.alreadyExist.getStatusCode());
				desciption.setStatusDescription(ConstantManager.alreadyExist.getStatusDescription());
			}
		} catch (Exception e) {
			desciption.setStatusCode(ConstantManager.ErrorOccured.getStatusCode());
			desciption.setStatusDescription(ConstantManager.ErrorOccured.getStatusDescription());
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ResponseRepo getHotels() {
		ResponseRepo response=new ResponseRepo();
		StatusDesciption desciption=new StatusDesciption();
		response.setStatusDesciption(desciption);
		try {
			;
			 List<Hotel> findAll = hotelRepo.findAll();
			 
			if(findAll!=null) {
			      response.setHotels(findAll);
				desciption.setStatusCode(ConstantManager.success.getStatusCode());
				desciption.setStatusDescription(ConstantManager.success.getStatusDescription());
			}
			else {
				desciption.setStatusCode(ConstantManager.notFound.getStatusCode());
				desciption.setStatusDescription(ConstantManager.notFound.getStatusDescription());
			}
		} catch (Exception e) {
			desciption.setStatusCode(ConstantManager.ErrorOccured.getStatusCode());
			desciption.setStatusDescription(ConstantManager.ErrorOccured.getStatusDescription());
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ResponseRepo getHotel(String hotelId) {
		ResponseRepo response=new ResponseRepo();
		StatusDesciption desciption=new StatusDesciption();
		response.setStatusDesciption(desciption);
		try {
			;
			Hotel hotel2 = hotelRepo.findByHotelId(hotelId);
			if(hotel2!=null) {
			      response.setHotel(hotel2);
				desciption.setStatusCode(ConstantManager.success.getStatusCode());
				desciption.setStatusDescription(ConstantManager.success.getStatusDescription());
			}
			else {
				desciption.setStatusCode(ConstantManager.notFound.getStatusCode());
				desciption.setStatusDescription(ConstantManager.notFound.getStatusDescription());
			}
		} catch (Exception e) {
			desciption.setStatusCode(ConstantManager.ErrorOccured.getStatusCode());
			desciption.setStatusDescription(ConstantManager.ErrorOccured.getStatusDescription());
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ResponseRepo updateHotel(Hotel hotel) {
		ResponseRepo response=new ResponseRepo();
		StatusDesciption desciption=new StatusDesciption();
		response.setStatusDesciption(desciption);
		try {
			;
			Hotel hotel2 = hotelRepo.findByHotelId(hotel.getHotelId());
			if(hotel2!=null) {
				hotel2.setAbout(hotel.getAbout());
				hotel2.setHotelName(hotel.getHotelName());
				hotel2.setLocation(hotel.getLocation());
			 Hotel saveAndFlush = hotelRepo.saveAndFlush(hotel2);
			 response.setHotel(saveAndFlush);
				desciption.setStatusCode(ConstantManager.success.getStatusCode());
				desciption.setStatusDescription(ConstantManager.success.getStatusDescription());
			}
			else {
				desciption.setStatusCode(ConstantManager.notFound.getStatusCode());
				desciption.setStatusDescription(ConstantManager.notFound.getStatusDescription());
			}
		} catch (Exception e) {
			desciption.setStatusCode(ConstantManager.ErrorOccured.getStatusCode());
			desciption.setStatusDescription(ConstantManager.ErrorOccured.getStatusDescription());
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ResponseRepo deleteHotel(String hotelId) {
		ResponseRepo response=new ResponseRepo();
		StatusDesciption desciption=new StatusDesciption();
		response.setStatusDesciption(desciption);
		try {
			;
			Hotel hotel2 = hotelRepo.findByHotelId(hotelId);
			if(hotel2!=null) {
			 hotelRepo.delete(hotel2);
				desciption.setStatusCode(ConstantManager.success.getStatusCode());
				desciption.setStatusDescription(ConstantManager.success.getStatusDescription());
			}
			else {
				desciption.setStatusCode(ConstantManager.notFound.getStatusCode());
				desciption.setStatusDescription(ConstantManager.notFound.getStatusDescription());
			}
		} catch (Exception e) {
			desciption.setStatusCode(ConstantManager.ErrorOccured.getStatusCode());
			desciption.setStatusDescription(ConstantManager.ErrorOccured.getStatusDescription());
			e.printStackTrace();
		}
		return response;
	}

}
