package com.RESngos.dao;

import java.util.List;

import com.RESngos.model.Restaurant;

public interface RestaurantDao {
	void insertRestaurant(Restaurant res);
	void insertRestaurants(List<Restaurant> restaurants);
	List<Restaurant> getAllRestaurants();
	Restaurant getRestaurantById(String resId);
}

