package me.exzork.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PlayerInfo{

	@SerializedName("profilePicture")
	private ProfilePicture profilePicture;

	@SerializedName("level")
	private Double level;

	@SerializedName("signature")
	private String signature;

	@SerializedName("nameCardId")
	private Double nameCardId;

	@SerializedName("nickname")
	private String nickname;

	@SerializedName("towerFloorIndex")
	private Double towerFloorIndex;

	@SerializedName("towerLevelIndex")
	private Double towerLevelIndex;

	@SerializedName("worldLevel")
	private Double worldLevel;

	@SerializedName("finishAchievementNum")
	private Double finishAchievementNum;

	@SerializedName("showAvatarInfoList")
	private List<ShowAvatarInfoListItem> showAvatarInfoList;

	public ProfilePicture getProfilePicture(){
		return profilePicture;
	}

	public Double getLevel(){
		return level;
	}

	public String getSignature(){
		return signature;
	}

	public Double getNameCardId(){
		return nameCardId;
	}

	public String getNickname(){
		return nickname;
	}

	public Double getTowerFloorIndex(){
		return towerFloorIndex;
	}

	public Double getTowerLevelIndex(){
		return towerLevelIndex;
	}

	public Double getWorldLevel(){
		return worldLevel;
	}

	public Double getFinishAchievementNum(){
		return finishAchievementNum;
	}

	public List<ShowAvatarInfoListItem> getShowAvatarInfoList(){
		return showAvatarInfoList;
	}
}