package com.altruist.service;

import com.altruist.entities.Hotel;
import com.altruist.request.RequestRepo;
import com.altruist.response.ResponseRepo;

public interface HotelService {
 public ResponseRepo createHotel(Hotel hotel);
 public ResponseRepo getHotels();
 public ResponseRepo getHotel(String  hotelId);
 public ResponseRepo updateHotel(Hotel hotel);
 public ResponseRepo deleteHotel(String  hotelId);
 
}
