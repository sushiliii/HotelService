package com.altruist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altruist.entities.Hotel;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface HotelRepo extends JpaRepository<Hotel, String> {

public	Hotel findByHotelId(String hotelId);

}
