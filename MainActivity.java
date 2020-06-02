package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int a1 = 11;
    private int b1 = 21;
    private int c1 = 31;
    private int a2 = 12;
    private int b2 = 22;
    private int c2 = 32;
    private int a3 = 13;
    private int b3 = 23;
    private int c3 = 33;
    private boolean gameOn = true;
    private boolean redTurn = true;
    public void a1click(View view) {
        ImageView a1r = (ImageView) findViewById(R.id.a1r);
        ImageView a1y = (ImageView) findViewById(R.id.a1y);
        if (a1 == 11) {
            if (gameOn) {
                if (redTurn) {
                    a1 = 1;
                    a1r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    a1 = 2;
                    a1y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void b1click(View view) {
        ImageView b1r = (ImageView) findViewById(R.id.b1r);
        ImageView b1y = (ImageView) findViewById(R.id.b1y);
        if (b1 == 21) {
            if (gameOn) {
                if (redTurn) {
                    b1 = 1;
                    b1r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    b1 = 2;
                    b1y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void c1click(View view) {
        ImageView c1r = (ImageView) findViewById(R.id.c1r);
        ImageView c1y = (ImageView) findViewById(R.id.c1y);
        if (c1 == 31) {
            if (gameOn) {
                if (redTurn) {
                    c1 = 1;
                    c1r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    c1 = 2;
                    c1y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    /////////////////////
    public void a2click(View view) {
        ImageView a2r = (ImageView) findViewById(R.id.a2r);
        ImageView a2y = (ImageView) findViewById(R.id.a2y);
        if (a2 == 12) {
            if (gameOn) {
                if (redTurn) {
                    a2 = 1;
                    a2r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    a2 = 2;
                    a2y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void b2click(View view) {
        ImageView b2r = (ImageView) findViewById(R.id.b2r);
        ImageView b2y = (ImageView) findViewById(R.id.b2y);
        if (b2 == 22) {
            if (gameOn) {
                if (redTurn) {
                    b2 = 1;
                    b2r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    b2 = 2;
                    b2y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void c2click(View view) {
        ImageView c2r = (ImageView) findViewById(R.id.c2r);
        ImageView c2y = (ImageView) findViewById(R.id.c2y);
        if (c2 == 32) {
            if (gameOn) {
                if (redTurn) {
                    c2 = 1;
                    c2r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    c2 = 2;
                    c2y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    ////////////////////
    public void a3click(View view) {
        ImageView a3r = (ImageView) findViewById(R.id.a3r);
        ImageView a3y = (ImageView) findViewById(R.id.a3y);
        if (a3 == 13) {
            if (gameOn) {
                if (redTurn) {
                    a3 = 1;
                    a3r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    a3 = 2;
                    a3y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void b3click(View view) {
        ImageView b3r = (ImageView) findViewById(R.id.b3r);
        ImageView b3y = (ImageView) findViewById(R.id.b3y);
        if (b3 == 23) {
            if (gameOn) {
                if (redTurn) {
                    b3 = 1;
                    b3r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    b3 = 2;
                    b3y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void c3click(View view) {
        ImageView c3r = (ImageView) findViewById(R.id.c3r);
        ImageView c3y = (ImageView) findViewById(R.id.c3y);
        if (c3 == 33) {
            if (gameOn) {
                if (redTurn) {
                    c3 = 1;
                    c3r.animate().alpha(1).setDuration(1000);
                    redTurn = false;
                } else {
                    c3 = 2;
                    c3y.animate().alpha(1).setDuration(1000);
                    redTurn = true;
                }
                if ((a1 == b1 && a1 == c1) || (a2 == b2 && a2 == c2) || (a3 == b3 && a3 == c3) || (a1 == b2 && a1 == c3) || (a3 == b2 && a3 == c1) || (a1 == a2 && a1 == a3) || (b1 == b2 && b1 == b3) || (c1 == c2 && c1 == c3)) {
                    if (!(redTurn)) {
                        Toast.makeText(this, "Red Has WON!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Yellow Has WON!", Toast.LENGTH_SHORT).show();
                    }
                    gameOn = false;
                }

            } else {
                Toast.makeText(this, "Game is Over!!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void newGame(View view){

        ImageView a1r = (ImageView) findViewById(R.id.a1r);
        ImageView b1r = (ImageView) findViewById(R.id.b1r);
        ImageView c1r = (ImageView) findViewById(R.id.c1r);
        ImageView a2r = (ImageView) findViewById(R.id.a2r);
        ImageView b2r = (ImageView) findViewById(R.id.b2r);
        ImageView c2r = (ImageView) findViewById(R.id.c2r);
        ImageView a3r = (ImageView) findViewById(R.id.a3r);
        ImageView b3r = (ImageView) findViewById(R.id.b3r);
        ImageView c3r = (ImageView) findViewById(R.id.c3r);
        ImageView a1y = (ImageView) findViewById(R.id.a1y);
        ImageView b1y = (ImageView) findViewById(R.id.b1y);
        ImageView c1y = (ImageView) findViewById(R.id.c1y);
        ImageView a2y = (ImageView) findViewById(R.id.a2y);
        ImageView b2y = (ImageView) findViewById(R.id.b2y);
        ImageView c2y = (ImageView) findViewById(R.id.c2y);
        ImageView a3y = (ImageView) findViewById(R.id.a3y);
        ImageView b3y = (ImageView) findViewById(R.id.b3y);
        ImageView c3y = (ImageView) findViewById(R.id.c3y);
        a1r.animate().alpha(0).setDuration(1000);
        a1y.animate().alpha(0).setDuration(1000);
        b1r.animate().alpha(0).setDuration(1000);
        b1y.animate().alpha(0).setDuration(1000);
        c1r.animate().alpha(0).setDuration(1000);
        c1y.animate().alpha(0).setDuration(1000);
        a2r.animate().alpha(0).setDuration(1000);
        a2y.animate().alpha(0).setDuration(1000);
        b2r.animate().alpha(0).setDuration(1000);
        b2y.animate().alpha(0).setDuration(1000);
        c2r.animate().alpha(0).setDuration(1000);
        c2y.animate().alpha(0).setDuration(1000);
        a3r.animate().alpha(0).setDuration(1000);
        a3y.animate().alpha(0).setDuration(1000);
        b3r.animate().alpha(0).setDuration(1000);
        b3y.animate().alpha(0).setDuration(1000);
        c3r.animate().alpha(0).setDuration(1000);
        c3y.animate().alpha(0).setDuration(1000);
        a1 = 11;
        b1 = 21;
        c1 = 31;
        a2 = 12;
        b2 = 22;
        c2 = 32;
        a3 = 13;
        b3 = 23;
        c3 = 33;
        redTurn = true;
        gameOn = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
