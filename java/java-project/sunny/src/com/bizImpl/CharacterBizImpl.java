package com.bizImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.CharacterBiz;
import com.dao.CharacterDao;
import com.entity.Character;
@Service("characterBizImpl")
public class CharacterBizImpl implements CharacterBiz {
	
	
	@Autowired
	private     CharacterDao       characterDao;

	public void setCharacterDao(CharacterDao characterDao) {
		this.characterDao = characterDao;
	}

	@Override
	public void insertCharacter(com.entity.Character character) {
		// TODO Auto-generated method stub
		characterDao.insertCharacter(character);	
	}

	@Override
	public Character selectCharacter(String user_username) {
		// TODO Auto-generated method stub
		   return  characterDao.selectCharacter(user_username);
	}

	@Override
	public void updateCharacter(Character character) {
		// TODO Auto-generated method stub
		characterDao.updateCharacter(character);
	}
}
