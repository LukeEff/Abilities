package io.github.lukeeff;

import org.bukkit.entity.Player;

public abstract class AbilitiesCore {
	
	abstract Player getTarget();
	abstract void setTarget(Player target);
	abstract void playParticles();
	
	public AbilitiesCore() {
		
	}
	

	
}
