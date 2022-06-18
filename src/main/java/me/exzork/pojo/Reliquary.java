package me.exzork.pojo;

import java.util.Collection;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Reliquary{

	@SerializedName("level")
	private Integer level;

	@SerializedName("mainPropId")
	private Integer mainPropId;

	@SerializedName("appendPropIdList")
	private List<Integer> appendPropIdList;

	public int getLevel(){
		return level;
	}

	public int getMainPropId(){
		return mainPropId;
	}

	public Collection<? extends Integer> getAppendPropIdList(){
		return appendPropIdList;
	}
}