package com.RESngos.service.imp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RESngos.dao.RestaurantDao;
import com.RESngos.model.Restaurant;
import com.RESngos.service.RestaurantService;

@Service
public class ResturantServiceImp1 implements RestaurantService {

	@Autowired
	RestaurantDao restaurantDao;

	public void insertRestaurant(Restaurant restaurant) {
		restaurantDao.insertRestaurant(restaurant);
	}

	public void insertRestaurants(List<Restaurant> restaurants) {
		restaurantDao.insertRestaurants(restaurants);
	}

	public void getAllRestaurants() {
		List<Restaurant> restaurants = restaurantDao.getAllRestaurants();
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant.toString());
		}
	}

	public void getRestaurantById(String resId) {
		Restaurant restaurant = restaurantDao.getRestaurantById(resId);
		System.out.println(restaurant);
	}

}
