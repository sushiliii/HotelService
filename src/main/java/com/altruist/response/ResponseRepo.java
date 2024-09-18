package com.altruist.response;

import java.util.List;

import com.altruist.entities.Hotel;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

import lombok.Data;

@Data
@JsonSerialize(include = Inclusion.NON_NULL)
public class ResponseRepo {
private StatusDesciption statusDesciption;
private Hotel hotel;
private List<Hotel> hotels;
}
