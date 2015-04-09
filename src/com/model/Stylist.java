package com.model;

import java.util.List;

public class Stylist extends User{
	private List<String> services;

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}
}