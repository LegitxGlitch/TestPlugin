package com.legitxglitch.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class TestPlugin extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */

	@Override
	protected void onPluginStart() {

		double bananas = 11 + 2;
		double apples = 15 * 2;
		double result = (bananas + apples) / 3.50;

		System.out.println(result);

		System.out.println(" ______    ___  _____ ______  ____  _      __ __   ____  ____  ____  \n" +
				"|      |  /  _]/ ___/|      ||    \\| |    |  |  | /    ||    ||    \\ \n" +
				"|      | /  [_(   \\_ |      ||  o  ) |    |  |  ||   __| |  | |  _  |\n" +
				"|_|  |_||    _]\\__  ||_|  |_||   _/| |___ |  |  ||  |  | |  | |  |  |\n" +
				"  |  |  |   [_ /  \\ |  |  |  |  |  |     ||  :  ||  |_ | |  | |  |  |\n" +
				"  |  |  |     |\\    |  |  |  |  |  |     ||     ||     | |  | |  |  |\n" +
				"  |__|  |_____| \\___|  |__|  |__|  |_____| \\__,_||___,_||____||__|__|\n" +
				"                                                                     ");

		System.out.println("All right reserved ©2023");

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */

	//Get an explosion when right click a COW.
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {

		event.getRightClicked().setInvulnerable(true);
		//	if (event.getRightClicked().getType() == EntityType.COW)
		//		event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}
}
