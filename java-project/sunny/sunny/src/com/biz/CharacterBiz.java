package com.biz;

import com.entity.Character;

public interface CharacterBiz {
	public    void    insertCharacter(com.entity.Character   character);
	
    public    Character   selectCharacter(String    user_username);
	
	public    void    updateCharacter(com.entity.Character   character); 

}
