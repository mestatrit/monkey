package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.GameMilitaryDetail;
import com.stang.game.entity.detail.GameTaskDetail;

public interface IGameMilitaryDao extends IEntityDao<GameMilitaryDetail> {

	public List<GameMilitaryDetail> getGameMilitary();
	public List<GameMilitaryDetail> findAllMilitary(Map<String,Object> param);
	public List<GameMilitaryDetail> findGameMilitaryByid(int id);
	public boolean insertGameMilitary(GameMilitaryDetail model);
	public boolean updateGameMilitary(Map<String, Object> param);
}
