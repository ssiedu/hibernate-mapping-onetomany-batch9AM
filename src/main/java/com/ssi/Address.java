package com.ssi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
*/
@Data
@AllArgsConstructor
//@ToString(exclude="city")
public class Address {
	
	private int hno;
	private String street;
	private String city;
	public String toString() {
		return hno+","+city;
	}
}
