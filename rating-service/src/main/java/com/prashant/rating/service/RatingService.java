package com.prashant.rating.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prashant.rating.entity.Rating;

@Service
public interface RatingService {

	public Rating create(Rating rating);

	List<Rating> getRatings();

	List<Rating> getRatingByUserId(String userId);

	List<Rating> getRatingByHotelId(String hotelId);

}
