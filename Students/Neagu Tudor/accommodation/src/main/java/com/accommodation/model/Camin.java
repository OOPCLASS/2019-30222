package com.accommodation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "camin")
public class Camin extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private Integer number;
	@Column
	private String admin;
	@Column
	private String adress;
	@Column(nullable = true)
	private Integer roomCount;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer id) {
		this.number = id;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Integer getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}
	
	
	

}
