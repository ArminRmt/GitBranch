package sample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class Controller {


    @FXML
    Button head;
    @FXML
    AnchorPane pane;
    @FXML
    TextArea Area1;
    @FXML
    TextArea Area2;


    int changestatus = 0;
    int count = 0;
    int count3 = 0;
    int count2 = 0;
    int num;



    LinkedList<Object> list1 = new LinkedList<Object>();
    double Array[][] = new double[50][2];

    LinkedList<String> time = new LinkedList<String>();


    public void Clicked(MouseEvent mouseEvent) {


        if (Area1.getText().equals("git commit")) {

            if (changestatus == 0) {
                count++;
                create_line();
                create_circle();

            } else if (changestatus == 1) {

                Line line = new Line();
                line.setStartX(Array[num][0] + 140.0);
                line.setStartY(Array[num][1]);
                line.setEndX(Array[num][0] + 30.0);
                line.setEndY(Array[num][1]);

                FadeTransition fade1 = new FadeTransition();
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0.1);
                fade1.setToValue(10);
                fade1.setCycleCount(1);
                fade1.setAutoReverse(false);
                fade1.setNode(line);
                fade1.play();

                pane.getChildren().add(line);


                count++;

                Circle circle = new Circle();
                circle.setCenterX(Array[num][0] + 150);
                circle.setCenterY(Array[num][1]);
                circle.setRadius(34.0);
                circle.setFill(Color.HOTPINK);
                circle.setStrokeWidth(8.0);
                circle.setStroke(Color.LIGHTGREEN);

                FadeTransition fade = new FadeTransition();
                fade.setDuration(Duration.millis(2000));
                fade.setFromValue(0.1);
                fade.setToValue(10);
                fade.setCycleCount(1);
                fade.setAutoReverse(false);
                fade.setNode(circle);
                fade.play();

                pane.getChildren().add(circle);


                int countt = 5;
                Text text = new Text(Array[num][0] + 195, Array[num][1] - 20, "c" + countt);
                text.setFill(Color.BROWN);
                text.setFont(Font.font(null, FontWeight.BOLD, 25));

                pane.getChildren().add(text);
                countt++;


                Array[count3][0] = circle.getCenterX();
                Array[count3][1] = circle.getCenterY();
                count3++;


                list1.add(circle);
                time.add(create_time());


                changestatus = 2;

            }else if(changestatus==3){


                Line line = new Line();
                line.setStartX(Array[num][0] +180);
                line.setStartY(Array[num][1] + 127);
                line.setEndX(Array[num][0] + 320 );
                line.setEndY(Array[num][1] + 127);

                FadeTransition fade1 = new FadeTransition();
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0.1);
                fade1.setToValue(10);
                fade1.setCycleCount(1);
                fade1.setAutoReverse(false);
                fade1.setNode(line);
                fade1.play();
                pane.getChildren().add(line);


                count++;

                Circle circle = new Circle();
                circle.setCenterX(Array[num][0] + 325);
                circle.setCenterY(Array[num][1]+ 120);
                circle.setRadius(34.0);
                circle.setFill(Color.HOTPINK);
                circle.setStrokeWidth(8.0);
                circle.setStroke(Color.LIGHTGREEN);

                FadeTransition fade = new FadeTransition();
                fade.setDuration(Duration.millis(2000));
                fade.setFromValue(0.1);
                fade.setToValue(10);
                fade.setCycleCount(1);
                fade.setAutoReverse(false);
                fade.setNode(circle);
                fade.play();

                pane.getChildren().add(circle);


                int countt = 7;
                Text text = new Text(Array[num][0] + 195, Array[num][1] - 20, "c" + countt);
                text.setFill(Color.BROWN);
                text.setFont(Font.font(null, FontWeight.BOLD, 25));

                pane.getChildren().add(text);
                countt++;


                Array[count3][0] = circle.getCenterX();
                Array[count3][1] = circle.getCenterY();
                count3++;


                list1.add(circle);
                time.add(create_time());




            }
            else {
                count2++;
                create_line2();
                create_circle2();


            }




        }else {

            changestatus = 1;
            String array[] = Area1.getText().split("");
            String s = array[array.length - 1];
            num = Integer.parseInt(s);
            if(num==6) changestatus=3;
            head_translation(num);


        }


        Area1.setText("");


    }

    private void create_line2() {

        double a = 100;
        double b = 170;

        for (int i = 1; i <= count2; i++) {

            Line line = new Line();
            line.setStartX(235);
            line.setStartY(a + ((double) i * 120));
            line.setEndX(235);
            line.setEndY(b + ((double) i * 120));

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(line);
            fade.play();
            pane.getChildren().add(line);

        }

    }


    private void create_line() {
        double a = 100;
        double b = 170;

        for (int i = 0; i < count; i++) {

            Line line = new Line();
            line.setStartX(86.0);
            line.setStartY(a + ((double) i * 120));
            line.setEndX(86.0);
            line.setEndY(b + ((double) i * 120));

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(line);
            fade.play();
            pane.getChildren().add(line);
        }
    }

    private void create_circle() {

        double a = 200.0;
        double b = 165;
        int countt = 1;


        for (int i = 0; i < count; i++) {

            Circle circle = new Circle();

            Text text = new Text(35, b + 120 * i, "c" + countt);
            text.setFill(Color.BROWN);
            text.setFont(Font.font(null, FontWeight.BOLD, 25));
            pane.getChildren().add(text);

            countt++;


            circle.setCenterX(86.0);
            circle.setCenterY(a + 120 * i);
            circle.setRadius(34.0);
            circle.setFill(Color.HOTPINK);
            circle.setStrokeWidth(8.0);
            circle.setStroke(Color.LIGHTGREEN);


            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(circle);
            fade.play();


            pane.getChildren().add(circle);


            Array[count3][0] = circle.getCenterX();
            Array[count3][1] = circle.getCenterY();


            time.add(create_time());


            count3++;


            list1.add(circle);




        }

    }

    private void create_circle2() {

        double a = 200;

        for (int i = 1; i <= count2; i++) {

            count++;
            Circle circle = new Circle();

            circle.setCenterX(235);
            circle.setCenterY(a + 120 * i);
            circle.setRadius(34.0);
            circle.setFill(Color.HOTPINK);
            circle.setStrokeWidth(8.0);
            circle.setStroke(Color.LIGHTGREEN);

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(circle);
            fade.play();

            pane.getChildren().add(circle);


            int countt = 6;
            Text text = new Text(Array[num][0] + 195,Array[num][1]+ 90,"c" + countt);
            text.setFill(Color.BROWN);
            text.setFont(Font.font(null, FontWeight.BOLD, 25));

            pane.getChildren().add(text);
            countt++;


            Array[count3][0] = circle.getCenterX();
            Array[count3][1] = circle.getCenterY();
            count3++;


            list1.add(circle);
            time.add(create_time());


        }
    }


    private String create_time() {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

        return timeStamp;
    }



    private void head_translation(int num) {


        if (num == 1) {

            Translate translate = new Translate();
            translate.setY(125);
            head.getTransforms().addAll(translate);



        } else if (num == 2) {
            Translate translate = new Translate();
            translate.setY(235);
            head.getTransforms().addAll(translate);

        }
        else if (num == 6) {
            Translate translate = new Translate();
            translate.setX(40);
            translate.setY(135);
            head.getTransforms().addAll(translate);
        }


    }


    public void Clicked2(MouseEvent mouseEvent) {

        String array[] = Area2.getText().split("");
        String s = array[array.length - 1];
        num = Integer.parseInt(s);

        Area2.setText("node c" + num + " created on:\n" + time.get(num));
    }
}
