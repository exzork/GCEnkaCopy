package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;

public class FetterInfo{

	@SerializedName("expLevel")
	private Double expLevel;

	public Double getExpLevel(){
		return expLevel;
	}
}