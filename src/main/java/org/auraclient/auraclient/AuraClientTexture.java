package org.auraclient.auraclient;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

/**
 * Represents a drawable texture in the Aura Client UI.
 * Uses the builder pattern for flexible texture creation and configuration.
 */
public class AuraClientTexture implements Drawable {
    // Predefined textures
    public static final Identifier BOX_1_1 = Identifier.of("auraclient", "textures/gui/box_1_1.png");

    private final Identifier sprite;
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Creates a new texture with the specified sprite.
     * @param sprite The identifier for the texture sprite
     */
    private AuraClientTexture(Identifier sprite) {
        this.sprite = sprite;
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    /**
     * Creates a new builder instance for the texture.
     * @param sprite The identifier for the texture sprite
     * @return A new AuraClientTexture instance
     */
    public static AuraClientTexture builder(Identifier sprite) {
        return new AuraClientTexture(sprite);
    }

    /**
     * Sets the dimensions and position of the texture.
     * @param x The x coordinate
     * @param y The y coordinate
     * @param width The width of the texture
     * @param height The height of the texture
     * @return This instance for method chaining
     */
    public AuraClientTexture dimensions(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        return this;
    }

    /**
     * Sets the focused state of the texture.
     * @param focused The focused state
     * @return This instance for method chaining
     */
    public AuraClientTexture setFocused(boolean focused) {
        return this;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawTexture(RenderLayer::getGuiTextured, sprite, x, y, 0, 0, width, height, width, height);
    }
}
