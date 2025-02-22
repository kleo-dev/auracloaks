package org.auraclient.auraclient.ui;

import net.minecraft.client.gui.DrawContext;

public class Button extends AuraWidget {
    public Runnable onClick;
    public String text;
    public static int hoverBorder = 0xFFFFFFFF;

    public Button(String button_text, int x, int y, int width, int height, Runnable on_click) {
        x1 = x;
        y1 = y;

        x2 = x + width;
        y2 = y + height;

        onClick = on_click;
        text = button_text;
    }

    public void render(DrawContext context, boolean hover) {

        context.fill(x1, y1, x2, y2, background);

        context.drawText(client.textRenderer, text, (((x2 - x1) - client.textRenderer.getWidth(text)) / 2) + x1, (((y2 - y1) - 6) / 2) + y1, foreground, false);

        if (hover) {
            context.drawBorder(x1 - 1, y1 - 1, x2 - x1 + 2, y2 - y1 + 2, hoverBorder);
        }
    }

    public void mouseClicked() {
        onClick.run();
    }
}