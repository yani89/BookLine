package com.BookLine.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;


@Entity
@Table(name="test")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column private String name;
	@Column private String keterangan;
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	public Contact(){}
	
	
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getKeterangan(){
		return keterangan;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKeterangan(String keterangan){
		this.keterangan = keterangan;
	}
	
}
