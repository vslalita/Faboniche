package com.model;

import java.util.Calendar;

public class Appointment implements Model{

	private int id;
	private int userId;
	private int StylistId;
	private Calendar startDate;
	private Calendar endDate;
	private String status;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStylistId() {
		return StylistId;
	}
	public void setStylistId(int stylistId) {
		StylistId = stylistId;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}