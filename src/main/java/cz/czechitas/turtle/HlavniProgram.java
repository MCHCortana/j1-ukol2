package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

        zofka.setLocation(100,600);
        zofka.setPenColor(new Color(255, 33,235));
        zmrzlina();

        zofka.turnRight(90); // žofka se srovná směrem nahoru

        zofka.setLocation(500,650);
        zofka.setPenColor(new Color(33, 203, 255));

        snehulak();
//        zofka.turnRight(180); // zofka se srovná směrem nahoru



    }

    public void zmrzlina(){
        mnohouhelnikRegular(9, 36, 10);
        zofka.turnRight(165);
        rovnoramennyTrojuhelnik(200, 30);
    }
    public void snehulak(){
        mnohouhelnikRegular(20, 36,10);
        zofka.penUp();
        mnohouhelnikRegular(20, 9,10);
        zofka.penDown();
        zofka.setY(zofka.getY() - 180);
        mnohouhelnikRegular(15, 36,10);
        zofka.penUp();
        mnohouhelnikRegular(15, 9,10);
        zofka.penDown();
        zofka.setX(zofka.getX() + 35);
        mnohouhelnikRegular(3, 36,10);
        zofka.setX(zofka.getX() - 215);
        mnohouhelnikRegular(3, 36,10);
        zofka.setX(zofka.getX() + 10);
        zofka.turnRight(180);
        zofka.penUp();
        mnohouhelnikRegular(15, 18,10);
        zofka.setY(zofka.getY() - 130);
        zofka.setX(zofka.getX() - 30);
        zofka.penDown();
        mnohouhelnikRegular(10, 36,10);
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

    public void rovnoramennyTrojuhelnik(double sideLength, int insideAngle){
        double angleRadians = Math.toRadians(insideAngle);
        double thirdSide =  2 * sideLength * Math.sin(angleRadians / 2);

        int topTurnAngle = insideAngle - 180;
        zofka.move(sideLength);
        zofka.turnRight(topTurnAngle);
        zofka.move(sideLength);
        zofka.turnLeft(topTurnAngle+180);
        zofka.turnRight((insideAngle - 180)/2);
        zofka.move(thirdSide);

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
