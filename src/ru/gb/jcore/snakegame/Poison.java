package ru.gb.jcore.snakegame;

import java.util.Random;

public class Poison extends Cell{
    private Random random;
    private Snake snake;
    private int x, y;

    public Poison(Snake snake){
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.POISON_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public void appear(){
        x = random.nextInt(GameSnake.CANVAS_WIDTH);
        y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        set(x, y);
    }

    public boolean poisoning(){
        return snake.isInSnake(x, y);
    }
}
