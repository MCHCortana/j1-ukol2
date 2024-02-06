package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

        rectangle(60,30, true);

    }

    public void mnohouhelnikRegular(double lineLength, int angleCount, int angle) {
        for (int i = 0; i < angleCount; i++) {
        zofka.move(lineLength);
        zofka.turnRight(angle);}
    }
    public void pravouhlyTrojuhelnik (int lineLenght) {
        var velikostPrepony = Math.sqrt(2*Math.pow(lineLenght, 2));
        zofka.move(lineLenght);
        zofka.turnRight(90);
        zofka.turnRight(45);
        zofka.move(velikostPrepony);
        zofka.turnRight(135);
        zofka.move(lineLenght);
    }

    public void rectangle(int longLine, int shortLine, boolean standing) {
        if (standing) {
            zofka.move(longLine);
            zofka.turnRight(90);
            zofka.move(shortLine);
            zofka.turnRight(90);
            zofka.move(longLine);
            zofka.turnRight(90);
            zofka.move(shortLine);
        } else {
            zofka.move(shortLine);
            zofka.turnRight(90);
            zofka.move(longLine);
            zofka.turnRight(90);
            zofka.move(shortLine);
            zofka.turnRight(90);
            zofka.move(longLine);
        }
    }

}
