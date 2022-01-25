package com.principal.dto;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemaReqDTO extends BaseDTO{

    private String name;
    private String level;
    private String time;
    private String trainer;
    private String price;
    private String description;
    //list languages
    private String lenguage;
    //transalations scrypts
    private String cc;
    //how many download content
    private String downloads;
    //link certificacion list
    private String certification;
    //how many
    private String video;
    //Full lifetime access
    private String type;
   
	
		
}
