package model.cells.characters;

import javafx.scene.canvas.GraphicsContext;

public interface Cell {

    void draw(GraphicsContext cell, int x, int y);

}
