package ru.gb.jcore.snakegame;

public class Model {
    final int SNAKE_DELAY = 150;
    int snakeSize = 0;
    static boolean gameOver = false;
    GameSnake gameSnake;
    Snake snake;
    Food food;
    Poison poison;

    public void game() {
        snake = new Snake(GameSnake.START_SNAKE_X, GameSnake.START_SNAKE_Y, GameSnake.START_SNAKE_SIZE, GameSnake.KEY_RIGHT);
        food = new Food(snake);
        poison = new Poison(snake);
        snake.setFood(food);
        snake.setPoison(poison);
        poison.appear();

        while (!gameOver){
            snake.move();
            if (snake.size() > snakeSize){
                snakeSize = snake.size();
                gameSnake.setTitle(gameSnake.TITLE_OF_PROGRAM + ":" + snakeSize);
            }
            if (food.isEaten()){
                food.appear();
            }
            if (poison.poisoning()){
                gameOver();
            }
            gameSnake.canvas.repaint();
            sleep(SNAKE_DELAY);
        }
    }

    private void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public boolean gameOver(){
        gameSnake.titleGameOver();
        return gameOver=true;
    }

    public void setGameSnake(GameSnake gameSnake){
        this.gameSnake = gameSnake;
    }
}
