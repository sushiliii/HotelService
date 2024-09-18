package com.altruist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tbl_hotel")
@Data
public class Hotel {
	@Id
private String id;
private String hotelId;
private String hotelName;
private String location;
private String about;
}
