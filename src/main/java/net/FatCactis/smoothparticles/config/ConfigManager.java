package net.FatCactis.smoothparticles.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigManager extends MidnightConfig {
    @Entry public static boolean breakParticles = false;
    @Entry(isSlider = true, min = 0f, max = 5f, precision = 1000) public static float particleMultiplier = 1f;
}