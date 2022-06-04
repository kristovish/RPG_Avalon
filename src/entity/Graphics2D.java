package entity;

import java.awt.image.BufferedImage;

public interface Graphics2D {

    void drawImage(BufferedImage image, int x, int y, int tileSize, int tileSize2, Object object);

}
