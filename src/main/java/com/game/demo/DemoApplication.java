package com.game.demo;

import com.game.demo.model.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class DemoApplication extends JFrame {

    public DemoApplication() {

        initUI();
    }
    private void initUI() {
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        EventQueue.invokeLater(() -> {
            DemoApplication ex = new DemoApplication();
            ex.setVisible(true);
        });
    }

}
