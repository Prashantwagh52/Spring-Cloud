package com.prashant.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prashant.hotel.entity.Hotel;

@Service
public interface HotelService {

	Hotel create(Hotel hotel);

	List<Hotel> getAll();

	Hotel get(String id);

}
