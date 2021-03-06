package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.GameTaskDetail;

public interface IGameTaskDao extends IEntityDao<GameTaskDetail> {

	public List<GameTaskDetail> getGameTask();
	public List<GameTaskDetail> findAllTask(Map<String,Object> param);
	public List<GameTaskDetail> findGameTaskByid(int id);
	public boolean insertGametask(GameTaskDetail model);
	public boolean updateGametask(Map<String, Object> param);
	
}
