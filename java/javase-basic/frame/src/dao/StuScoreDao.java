package dao;

import java.util.List;

import model.StuScore;

public interface StuScoreDao  {
	
	public List<StuScore> getStuScores();
	
	public int deleteStuScore(Object...objects);
	
	public int updateStuScore(Object...objects);
	
	public int addStuScore(Object...objects);
}
