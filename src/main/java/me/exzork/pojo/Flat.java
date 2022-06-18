package me.exzork.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Flat{

	@SerializedName("itemType")
	private String itemType;

	@SerializedName("nameTextMapHash")
	private String nameTextMapHash;

	@SerializedName("rankLevel")
	private Double rankLevel;

	@SerializedName("weaponStats")
	private List<WeaponStatsItem> weaponStats;

	@SerializedName("icon")
	private String icon;

	@SerializedName("reliquarySubstats")
	private List<ReliquarySubstatsItem> reliquarySubstats;

	@SerializedName("equipType")
	private String equipType;

	@SerializedName("setNameTextMapHash")
	private String setNameTextMapHash;

	@SerializedName("reliquaryMainstat")
	private ReliquaryMainstat reliquaryMainstat;

	public String getItemType(){
		return itemType;
	}

	public String getNameTextMapHash(){
		return nameTextMapHash;
	}

	public Double getRankLevel(){
		return rankLevel;
	}

	public List<WeaponStatsItem> getWeaponStats(){
		return weaponStats;
	}

	public String getIcon(){
		return icon;
	}

	public List<ReliquarySubstatsItem> getReliquarySubstats(){
		return reliquarySubstats;
	}

	public String getEquipType(){
		return equipType;
	}

	public String getSetNameTextMapHash(){
		return setNameTextMapHash;
	}

	public ReliquaryMainstat getReliquaryMainstat(){
		return reliquaryMainstat;
	}
}