package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;

public class EquipListItem{

	@SerializedName("itemId")
	private Integer itemId;

	@SerializedName("weapon")
	private Weapon weapon;

	@SerializedName("flat")
	private Flat flat;

	@SerializedName("reliquary")
	private Reliquary reliquary;

	public int getItemId(){
		return itemId;
	}

	public Weapon getWeapon(){
		return weapon;
	}

	public Flat getFlat(){
		return flat;
	}

	public Reliquary getReliquary(){
		return reliquary;
	}
}