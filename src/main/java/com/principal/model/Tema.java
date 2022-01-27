package com.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tema")
public class Tema extends Base {

	@Column(name = "Name")
	private String name;
	@Column(name = "Level")
	private String level;
	@Column(name = "Time")
	private String time;
	@Column(name = "Trainer")
	private String trainer;
	@Column(name = "Price")
	private String price;
	@Column(name = "Description")
	private String description;
	@Column(name = "Language")
	private String language;
	@Column(name = "CC")
	private String cc;
	@Column(name = "Download")
	private String download;
	@Column(name = "Certification")
	private String certification;
	@Column(name = "Videos")
	private String videos;
	@Column(name = "Type")
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
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getVideos() {
		return videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
