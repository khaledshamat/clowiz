package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="page1")
public class Page1 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="field_1")
	private Date field1;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setField1(Date field1){
	  this.field1=field1;
	}
	
	public Date getField1(){
	 return this.field1;
	}
		

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((Page1) obj).getId());
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.field1).append(",");
	  return buf.toString();
	}
}