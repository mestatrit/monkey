package com.stang.game.service;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.GameFoeDetail;

public interface IGameFoeService extends IBaseService<GameFoeDetail> {
	public List<GameFoeDetail> getGameFoe();
	public List<GameFoeDetail> findAllFoe(Map<String,Object> param);
	public List<GameFoeDetail> findGameFoeByid(int id);
	public boolean insertGameFoe(GameFoeDetail model);
	public boolean updateGameFoe(Map<String, Object> param);
}
