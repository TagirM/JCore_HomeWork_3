package ru.gb.jcore.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame {
    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "GAME-OVER";
    final static int CELL_SIZE = 20;
    final static int CANVAS_WIDTH = 30;
    final static int CANVAS_HEIGHT = 25;
    final static Color SNAKE_COLOR = Color.DARK_GRAY;
    final static Color FOOD_COLOR = Color.GREEN;
    final static Color POISON_COLOR = Color.RED;
    final static int KEY_LEFT = 37;
    final static int KEY_UP = 38;
    final static int KEY_RIGHT = 39;
    final static int KEY_DOWN = 40;
    final static int START_SNAKE_SIZE = 5;
    final static int START_SNAKE_X = CANVAS_WIDTH/2;
    final static int START_SNAKE_Y = CANVAS_HEIGHT/2;
    Canvas canvas;
    Model model;

    public GameSnake(Model model) {
        this.model = model;
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH, CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                model.snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        Model model = new Model();
        GameSnake gameSnake = new GameSnake(model);
        model.setGameSnake(gameSnake);
        model.game();
    }

    public void titleGameOver(){
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.setPreferredSize(new Dimension(400, 50));
        add(canvas);
        pack();
        setTitle(TITLE_OF_PROGRAM + ": " + GAME_OVER_MSG);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    class Canvas extends JPanel{
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            model.snake.paint(g2D);
            model.food.paint(g2D);
            model.poison.paint(g2D);
        }
    }
}
