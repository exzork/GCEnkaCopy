package me.exzork.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("playerInfo")
	private PlayerInfo playerInfo;

	@SerializedName("avatarInfoList")
	private List<AvatarInfoListItem> avatarInfoList;

	@SerializedName("ttl")
	private Double ttl;

	public PlayerInfo getPlayerInfo(){
		return playerInfo;
	}

	public List<AvatarInfoListItem> getAvatarInfoList(){
		return avatarInfoList;
	}

	public Double getTtl(){
		return ttl;
	}
}