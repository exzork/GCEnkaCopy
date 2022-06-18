package me.exzork.pojo;

import java.util.HashMap;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AvatarInfoListItem{

	@SerializedName("costumeId")
	private Integer costumeId;

	@SerializedName("avatarId")
	private Integer avatarId;

	@SerializedName("equipList")
	private List<EquipListItem> equipList;

	@SerializedName("talentIdList")
	private List<Integer> talentIdList;

	@SerializedName("skillLevelMap")
	private HashMap<String, Integer> skillLevelMap;

	@SerializedName("fetterInfo")
	private FetterInfo fetterInfo;

	@SerializedName("skillDepotId")
	private Double skillDepotId;

	@SerializedName("inherentProudSkillList")
	private List<Double> inherentProudSkillList;

	public Integer getCostumeId(){
		return costumeId;
	}

	public int getAvatarId(){
		return avatarId;
	}

	public List<EquipListItem> getEquipList(){
		return equipList;
	}

	public List<Integer> getTalentIdList(){
		return talentIdList;
	}

	public HashMap<String, Integer> getSkillLevelMap(){
		return skillLevelMap;
	}

	public FetterInfo getFetterInfo(){
		return fetterInfo;
	}

	public Double getSkillDepotId(){
		return skillDepotId;
	}

	public List<Double> getInherentProudSkillList(){
		return inherentProudSkillList;
	}
}