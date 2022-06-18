package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;

public class ShowAvatarInfoListItem{

	@SerializedName("costumeId")
	private Integer costumeId;

	@SerializedName("avatarId")
	private Integer avatarId;

	@SerializedName("level")
	private Integer level;

	public Integer getCostumeId(){
		return costumeId;
	}

	public Integer getAvatarId(){
		return avatarId;
	}

	public Integer getLevel(){
		return level;
	}
}