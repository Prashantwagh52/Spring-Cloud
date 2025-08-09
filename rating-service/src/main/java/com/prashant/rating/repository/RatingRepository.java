package com.prashant.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashant.rating.entity.Rating;
import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {

	List<Rating> findByUserId(String userId);

	List<Rating> findByHotelId(String hotelId);
}
