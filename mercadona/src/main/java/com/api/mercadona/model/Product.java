package com.api.mercadona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
	
	@Entity
	public class Product {

    @Id
    @GeneratedValue(
    	    strategy = GenerationType.SEQUENCE,
    	    generator = "seq_post"
    	)
    @SequenceGenerator(
    	    name = "seq_post",
    	    allocationSize = 9
    	)
    private Long id;
	private String name;
	private String uRL;
	private String size;

		// standard constructors
	public Product() {
		super();
	}
	
	public Product(Long id, String name, String uRL, String size) {
		super();
		this.id = id;
		this.name = name;
		this.uRL = uRL;
		this.size = size;
	}
	
	 // standard getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getuRL() {
		return uRL;
	}
	public void setuRL(String uRL) {
		this.uRL = uRL;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, uRL=%s, size=%s]", id, name, uRL, size);
	}
	
}