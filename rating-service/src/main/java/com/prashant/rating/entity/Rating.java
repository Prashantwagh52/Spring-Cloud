package com.prashant.rating.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_ratings")
public class Rating {

	@Id
	private String ratingId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "hotel_id")
	private String hotelId;

	@Column(name = "rating")
	private int rating;

	@Column(name = "feedback")
	private String feedback;
}
