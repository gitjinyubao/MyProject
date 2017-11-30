package com.dao;

import com.entity.Character;

public interface CharacterDao {
	public    void    insertCharacter(com.entity.Character   character);
	
	public    Character   selectCharacter(String    user_username);
	
	public    void    updateCharacter(com.entity.Character   character);   

}
