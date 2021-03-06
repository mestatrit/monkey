package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.ActivityDetail;

public interface IActivityDao extends IEntityDao<ActivityDetail>{

	public List<ActivityDetail> getActivityByParams(Map<String,Object> param);
	
	public boolean updateActivityById(Map<String,Object> param);
}
