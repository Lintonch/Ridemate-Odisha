package com.ridemate.odisha.ridemate.dto;

import lombok.Data;

@Data
public class RegisterRequest {
	
	private String name;
    private String email;
    private String password;
    private String role; // DRIVER or PASSENGER

}
