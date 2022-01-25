package com.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Tema")
public class Tema extends Base{


	@Column(name="Name")
    private String name;
	@Column(name="Level")
    private String level;
	@Column(name="Time")
    private String time;
	@Column(name="Trainer")
    private String trainer;
	@Column(name="Price")
    private String price;
	@Column(name="Description")
    private String description;
	@Column(name="Language")
    private String language;
	@Column(name="CC")
    private String cc;
	@Column(name="Download")
    private String download;
	@Column(name="Certification")
    private String certification;
	@Column(name="Videos")
    private String videos;
	@Column(name="Type")
    private String type;
	
	
	

	
	public Tema(String name, String level, String time, String trainer, String price, String description,
			String language, String cc, String download, String certification, String videos, String type) {

		this.name = name;
		this.level = level;
		this.time = time;
		this.trainer = trainer;
		this.price = price;
		this.description = description;
		this.language = language;
		this.cc = cc;
		this.download = download;
		this.certification = certification;
		this.videos = videos;
		this.type = type;
	}

	public Tema() {
	}
	
	 

	
		
}
