package tile;



import entity.Graphics2D;
import main.GamePanel;

public class TileManager{

    GamePanel gp;
    Tile[] tile;
    
    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[10];

        getTileImage();
    }

    public void getTileImage() {

        tile[0] = new Tile();
        tile[0] = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));

        tile[1] = new Tile();
        tile[1] = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));

        tile[2] = new Tile();
        tile[2] = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
    }
    
public void draw(Graphics2D g2) {

    g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
}

public void draw(java.awt.Graphics2D g2) {
}

 }



 