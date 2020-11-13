package com.example.tictactoc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class game_layout_onePlayer extends AppCompatActivity {

    private TextView text_1, text_2, text_3, text_4, text_5, text_6, text_7, text_8, text_9;
    private String letter = "X" ,L = "";
    private boolean check = true;
    private int count = 0;
    private int[] Arr = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);

        Button btn_back = (Button) findViewById(R.id.btn_back);
        Button btn_restart = (Button) findViewById(R.id.btn_restart);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_layout_onePlayer.this, MainActivity.class));
                finish();
            }
        });
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        text_1 = (TextView) findViewById(R.id.text_1);
        text_2 = (TextView) findViewById(R.id.text_2);
        text_3 = (TextView) findViewById(R.id.text_3);
        text_4 = (TextView) findViewById(R.id.text_4);
        text_5 = (TextView) findViewById(R.id.text_5);
        text_6 = (TextView) findViewById(R.id.text_6);
        text_7 = (TextView) findViewById(R.id.text_7);
        text_8 = (TextView) findViewById(R.id.text_8);
        text_9 = (TextView) findViewById(R.id.text_9);

        action();

    }

    public void action(){

        text_1.setClickable(true);
        text_1.setText("");
        text_2.setClickable(true);
        text_2.setText("");
        text_3.setClickable(true);
        text_3.setText("");
        text_4.setClickable(true);
        text_4.setText("");
        text_5.setClickable(true);
        text_5.setText("");
        text_6.setClickable(true);
        text_6.setText("");
        text_7.setClickable(true);
        text_7.setText("");
        text_8.setClickable(true);
        text_8.setText("");
        text_9.setClickable(true);
        text_9.setText("");

        text_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_1.setText(letter);
                checkLetter();
                text_1.setClickable(false);
                count++;
                checkGame();
                Arr[0] = 0;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_2.setText(letter);
                checkLetter();
                text_2.setClickable(false);
                count++;
                checkGame();
                Arr[1] = 1;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_3.setText(letter);
                checkLetter();
                text_3.setClickable(false);
                count++;
                checkGame();
                Arr[2] = 2;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_4.setText(letter);
                checkLetter();
                text_4.setClickable(false);
                count++;
                checkGame();
                Arr[3] = 3;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_5.setText(letter);
                checkLetter();
                text_5.setClickable(false);
                count++;
                checkGame();
                Arr[4] = 4;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_6.setText(letter);
                checkLetter();
                text_6.setClickable(false);
                count++;
                checkGame();
                Arr[5] = 5;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_7.setText(letter);
                checkLetter();
                text_7.setClickable(false);
                count++;
                checkGame();
                Arr[6] = 6;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_8.setText(letter);
                checkLetter();
                text_8.setClickable(false);
                count++;
                checkGame();
                Arr[7] = 7;
                if(checkGame()){
                    AI();
                }
            }
        });
        text_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_9.setText(letter);
                checkLetter();
                text_9.setClickable(false);
                count++;
                checkGame();
                Arr[8] = 8;
                if(checkGame()){
                    AI();
                }
            }
        });
    }

    public void checkLetter(){
        if(letter == "X") {
            letter = "O";
            L = "X";
        }
        else {
            letter = "X";
            L = "O";
        }
    }

    public boolean checkGame(){
        if (count >= 0 && count <9) {
            checkWin();
            return check;
        }
        if(count == 9) {
            drawDialog();
            return false;
        }
        return true;
    }

    public int linearSearch(int[] array, int key) {
        for(int k = 0; k < array.length; k++)
            if(array[k] == key)
                return k;
        return -1;
    }

    public void AI(){
        int ai = (int) (Math.random() * 9);
        switch (ai) {
            case 0 :
                if (text_1.isClickable()) {
                    text_1.setText(letter);
                    checkLetter();
                    text_1.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 0) == 0) ;
                    AI();
                }
            break;
            case 1 :
                if (text_2.isClickable()) {
                    text_2.setText(letter);
                    checkLetter();
                    text_2.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 1) == 1) ;
                    AI();
                }
            break;
            case 2 :
                if (text_3.isClickable()) {
                    text_3.setText(letter);
                    checkLetter();
                    text_3.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 2) == 2) ;
                    AI();
                }
            break;
            case 3 :
                if (text_4.isClickable()) {
                    text_4.setText(letter);
                    checkLetter();
                    text_4.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 3) == 3) ;
                    AI();
                }
            break;
            case 4 :
                if (text_5.isClickable()) {
                    text_5.setText(letter);
                    checkLetter();
                    text_5.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 4) == 4) ;
                    AI();
                }
            break;
            case 5 :
                if (text_6.isClickable()) {
                    text_6.setText(letter);
                    checkLetter();
                    text_6.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 5) == 5) ;
                    AI();
                }
            break;
            case 6 :
                if (text_7.isClickable()) {
                    text_7.setText(letter);
                    checkLetter();
                    text_7.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 6) == 6) ;
                    AI();
                }
            break;
            case 7 :
                if (text_8.isClickable()) {
                    text_8.setText(letter);
                    checkLetter();
                    text_8.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 7) == 7) ;
                    AI();
                }
            break;
            case 8 :
                if (text_9.isClickable()) {
                    text_9.setText(letter);
                    checkLetter();
                    text_9.setClickable(false);
                    count++;
                    checkGame();
                } else {
                    if (linearSearch(Arr, 8) == 8) ;
                    AI();
                }
            break;
        }
    }

    public void checkWin(){
        if(check == true) {
            if (text_1.getText() == text_2.getText()) {
                if (text_2.getText() == text_3.getText()){
                    if(text_3.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_3.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_1.getText() == text_5.getText()) {
                if (text_5.getText() == text_9.getText()){
                    if(text_9.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_9.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_1.getText() == text_4.getText()) {
                if (text_4.getText() == text_7.getText()){
                    if(text_7.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_7.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_3.getText() == text_5.getText()) {
                if (text_5.getText() == text_7.getText()){
                    if(text_7.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_7.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_3.getText() == text_6.getText()) {
                if (text_6.getText() == text_9.getText()){
                    if(text_9.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_9.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_2.getText() == text_5.getText()) {
                if (text_5.getText() == text_8.getText()){
                    if(text_8.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_8.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_4.getText() == text_5.getText()) {
                if (text_5.getText() == text_6.getText()){
                    if(text_6.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_6.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
            if (text_7.getText() == text_8.getText()) {
                if (text_8.getText() == text_9.getText()){
                    if(text_9.getText() == "X"){
                        showDialog();
                        check = false;
                        count--;
                    }
                    else if (text_9.getText() == "O"){
                        showDialog();
                        check = false;
                        count--;
                    }
                }
            }
        }
    }

    public void toFalse(){
        text_1.setClickable(false);
        text_2.setClickable(false);
        text_3.setClickable(false);
        text_4.setClickable(false);
        text_5.setClickable(false);
        text_6.setClickable(false);
        text_7.setClickable(false);
        text_8.setClickable(false);
        text_9.setClickable(false);
    }

    public void showDialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(game_layout_onePlayer.this);
        dialog.setMessage("Letter " + L + " You Win");
        dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.setPositiveButton("play again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                action();
                recreate();
            }
        });
        dialog.show();
        toFalse();
    }

    public void drawDialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(game_layout_onePlayer.this);
        dialog.setTitle("Draw");
        dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.setPositiveButton("play again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                action();
                recreate();
            }
        });
        dialog.show();
        toFalse();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(game_layout_onePlayer.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}