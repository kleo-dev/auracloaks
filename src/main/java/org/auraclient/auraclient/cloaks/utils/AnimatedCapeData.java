package org.auraclient.auraclient.cloaks.utils;

import net.minecraft.util.Identifier;

/**
 * Represents a single frame of an animated cape.
 */
public class AnimatedCapeData {
    private final Identifier textureId;
    private final int delayMs;

    /**
     * Creates a new animated cape frame.
     * @param textureId The texture identifier for this frame
     * @param delayMs The delay in milliseconds before the next frame
     */
    public AnimatedCapeData(Identifier textureId, int delayMs) {
        this.textureId = textureId;
        this.delayMs = delayMs;
    }

    /**
     * @return The texture identifier for this frame
     */
    public Identifier getTextureId() {
        return textureId;
    }

    /**
     * @return The delay in milliseconds before the next frame
     */
    public int getDelayMs() {
        return delayMs;
    }
}
