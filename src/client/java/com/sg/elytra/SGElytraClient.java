package com.sg.elytra;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class SGElytraClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		SwapKeyBinding keyBinding = new SwapKeyBinding("SG Elytra swap", GLFW.GLFW_KEY_CAPS_LOCK, "SG Elytra swap");
		KeyBindingHelper.registerKeyBinding(keyBinding);
	}

}