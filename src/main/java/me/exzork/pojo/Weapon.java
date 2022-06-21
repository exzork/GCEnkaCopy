package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;
import it.unimi.dsi.fastutil.Hash;

import java.util.HashMap;

public class Weapon{

	@SerializedName("level")
	private Integer level;

	@SerializedName("affixMap")
	private HashMap<String,Integer> affixMap;

	@SerializedName("promoteLevel")
	private Integer promoteLevel = 0;

	public int getLevel(){
		return level;
	}

	public HashMap<String,Integer> getAffixMap(){
		return affixMap;
	}

	public int getPromoteLevel(){
		return promoteLevel;
	}
}