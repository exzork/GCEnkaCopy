package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;

public class WeaponStatsItem{

	@SerializedName("statValue")
	private Double statValue;

	@SerializedName("appendPropId")
	private String appendPropId;

	public Double getStatValue(){
		return statValue;
	}

	public String getAppendPropId(){
		return appendPropId;
	}
}