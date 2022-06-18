package me.exzork.pojo;

import com.google.gson.annotations.SerializedName;

public class ProfilePicture{

	@SerializedName("avatarId")
	private Double avatarId;

	public Double getAvatarId(){
		return avatarId;
	}
}