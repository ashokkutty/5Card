package com.ashokkumar.a5card;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //Initialize of all Id's
    ImageView iv_opp_deck,iv_all_deck,iv_card1,iv_card2,iv_card3,iv_card4,iv_card5, iv_released;
    TextView cardvalue;
    ArrayList<Integer> cards;
    int allcard_val=0, animduration=1000;
    Button release,declare;
    /* int alldec,c1,c2,c3,c4,c5,rel,dec=0; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardvalue= findViewById(R.id.cardvalue);
        iv_opp_deck= findViewById(R.id.iv_opp_deck);
        iv_released=findViewById(R.id.iv_released);
        iv_all_deck= findViewById(R.id.iv_all_deck);
        iv_card1= findViewById(R.id.iv_card1);
        iv_card2= findViewById(R.id.iv_card2);
        iv_card3= findViewById(R.id.iv_card3);
        iv_card4= findViewById(R.id.iv_card4);
        iv_card5= findViewById(R.id.iv_card5);

        iv_card1.setVisibility(View.INVISIBLE);
        iv_card2.setVisibility(View.INVISIBLE);
        iv_card3.setVisibility(View.INVISIBLE);
        iv_card4.setVisibility(View.INVISIBLE);
        iv_card5.setVisibility(View.INVISIBLE);
        //iv_released.setVisibility(View.INVISIBLE);

        cards=new ArrayList<>();
        assignCardNo(cards);

        dealCard();

        Toast.makeText(MainActivity.this, "Cards Dealed", Toast.LENGTH_SHORT).show();

    }

    public void dealCard() //To deal shuffled cards
    {
        int x=0;
        if (x==0) {
            //Cards Shuffling
            Collections.shuffle(cards);
            //Deal first 5 cards
            assignImages(cards.get(0), iv_card1);
            assignImages(cards.get(1), iv_card2);
            assignImages(cards.get(2), iv_card3);
            assignImages(cards.get(3), iv_card4);
            assignImages(cards.get(4), iv_card5);

            iv_card1.setVisibility(View.VISIBLE);
            iv_card2.setVisibility(View.VISIBLE);
            iv_card3.setVisibility(View.VISIBLE);
            iv_card4.setVisibility(View.VISIBLE);
            iv_card5.setVisibility(View.VISIBLE);

            assignValue();
            x++;

            for(int i=0;i>4;i++) //To remove the deal cards from array, to avoid repeatition
            {
                cards.remove(i);
            }
        }
        else
        {
            System.exit(0);
        }
    }

    public void assignValue() //Calc of Total card Value
    {
        int a1=cards.get(0);
        int a2=cards.get(1);
        int a3=cards.get(2);
        int a4=cards.get(3);
        int a5=cards.get(4);
        int value=0, tot=0;
        //Loop for Clover
        for (int x=101;x<=113;x++)
        {
            int x1=x;
            if (x1>109)
            {
                x1=10;
            }
            if (a1==x)
            {
                value=value+x1;
            }
            else if (a2==x)
            {
                value=value+x1;
            }
            else if(a3==x)
            {
                value+=x1;
            }
            else if(a4==x)
            {
                value+=x1;
            }
            else if (a5==x)
            {
                value+=x1;
            }
        }
        //Loop for Diamonds
        for (int x=201;x<=213;x++)
        {
            int x1=x;
            if (x1>209)
            {
                x1=10;
            }
            if (a1==x)
            {
                value=value+x1;
            }
            else if (a2==x)
            {
                value=value+x1;
            }
            else if(a3==x)
            {
                value+=x1;
            }
            else if(a4==x)
            {
                value+=x1;
            }
            else if (a5==x)
            {
                value+=x1;
            }
        }
        //Loop for Hearts
        for (int x=301;x<=313;x++)
        {
            int x1=x;
            if (x1>309)
            {
                x1=10;
            }
            if (a1==x)
            {
                value=value+x1;
            }
            else if (a2==x)
            {
                value=value+x1;
            }
            else if(a3==x)
            {
                value+=x1;
            }
            else if(a4==x)
            {
                value+=x1;
            }
            else if (a5==x)
            {
                value+=x1;
            }
        }
        //Loop for Spade
        for (int x=401;x<=413;x++)
        {
            int x1=x;
            if (x1>409)
            {
                x1=10;
            }
            if (a1==x)
            {
                value=value+x1;
            }
            else if (a2==x)
            {
                value=value+x1;
            }
            else if(a3==x)
            {
                value+=x1;
            }
            else if(a4==x)
            {
                value+=x1;
            }
            else if (a5==x)
            {
                value+=x1;
            }
        }
        tot=value%100; //To get last two digit
        cardvalue.setText(String.format("Card Value %d", tot));
    }

    public void assignImages(int card,ImageView image)//Assign of card no. with images.
    {
        switch (card){
            //Clover
            case 101:
                image.setImageResource(R.drawable.ac);
                break;
            case 102:
                image.setImageResource(R.drawable.twoc);
                break;
            case 103:
                image.setImageResource(R.drawable.c3);
                break;
            case 104:
                image.setImageResource(R.drawable.c4);
                break;
            case 105:
                image.setImageResource(R.drawable.c5);
                break;
            case 106:
                image.setImageResource(R.drawable.c6);
                break;
            case 107:
                image.setImageResource(R.drawable.c7);
                break;
            case 108:
                image.setImageResource(R.drawable.c8);
                break;
            case 109:
                image.setImageResource(R.drawable.c9);
                break;
            case 110:
                image.setImageResource(R.drawable.c10);
                break;
            case 111:
                image.setImageResource(R.drawable.jc);
                break;
            case 112:
                image.setImageResource(R.drawable.qc);
                break;
            case 113:
                image.setImageResource(R.drawable.kc);
                break;
                //Switch Case for Diamonds
            case 201:
                image.setImageResource(R.drawable.ad);
                break;
            case 202:
                image.setImageResource(R.drawable.twod);
                break;
            case 203:
                image.setImageResource(R.drawable.d3);
                break;
            case 204:
                image.setImageResource(R.drawable.d4);
                break;
            case 205:
                image.setImageResource(R.drawable.d5);
                break;
            case 206:
                image.setImageResource(R.drawable.d6);
                break;
            case 207:
                image.setImageResource(R.drawable.d7);
                break;
            case 208:
                image.setImageResource(R.drawable.d8);
                break;
            case 209:
                image.setImageResource(R.drawable.d9);
                break;
            case 210:
                image.setImageResource(R.drawable.d10);
                break;
            case 211:
                image.setImageResource(R.drawable.jd);
                break;
            case 212:
                image.setImageResource(R.drawable.qd);
                break;
            case 213:
                image.setImageResource(R.drawable.kd);
                break;
            //Hearts
            case 301:
                image.setImageResource(R.drawable.ah);
                break;
            case 302:
                image.setImageResource(R.drawable.twoh);
                break;
            case 303:
                image.setImageResource(R.drawable.h3);
                break;
            case 304:
                image.setImageResource(R.drawable.h4);
                break;
            case 305:
                image.setImageResource(R.drawable.h5);
                break;
            case 306:
                image.setImageResource(R.drawable.h6);
                break;
            case 307:
                image.setImageResource(R.drawable.h7);
                break;
            case 308:
                image.setImageResource(R.drawable.h8);
                break;
            case 309:
                image.setImageResource(R.drawable.h9);
                break;
            case 310:
                image.setImageResource(R.drawable.h10);
                break;
            case 311:
                image.setImageResource(R.drawable.jh);
                break;
            case 312:
                image.setImageResource(R.drawable.qh);
                break;
            case 313:
                image.setImageResource(R.drawable.kh);
                break;
            //spade
            case 401:
                image.setImageResource(R.drawable.as);
                break;
            case 402:
                image.setImageResource(R.drawable.twos);
                break;
            case 403:
                image.setImageResource(R.drawable.s3);
                break;
            case 404:
                image.setImageResource(R.drawable.s4);
                break;
            case 405:
                image.setImageResource(R.drawable.s5);
                break;
            case 406:
                image.setImageResource(R.drawable.s6);
                break;
            case 407:
                image.setImageResource(R.drawable.s7);
                break;
            case 408:
                image.setImageResource(R.drawable.s8);
                break;
            case 409:
                image.setImageResource(R.drawable.s9);
                break;
            case 410:
                image.setImageResource(R.drawable.s10);
                break;
            case 411:
                image.setImageResource(R.drawable.js);
                break;
            case 412:
                image.setImageResource(R.drawable.qs);
                break;
            case 413:
                image.setImageResource(R.drawable.ks);
                break;


        }

    }

    public void assignCardNo(ArrayList<Integer> cards)//Assign of Cards with unique nos.
    {
        cards.add(101); //Ace of clover & family of clover
        cards.add(102);
        cards.add(103);
        cards.add(104);
        cards.add(105);
        cards.add(106);
        cards.add(107);
        cards.add(108);
        cards.add(109);
        cards.add(110);
        cards.add(111);
        cards.add(112);
        cards.add(113);
        //diamonds
        cards.add(201);
        cards.add(202);
        cards.add(203);
        cards.add(204);
        cards.add(205);
        cards.add(206);
        cards.add(207);
        cards.add(208);
        cards.add(209);
        cards.add(210);
        cards.add(211);
        cards.add(212);
        cards.add(213);
        //Hearts
        cards.add(301);
        cards.add(302);
        cards.add(303);
        cards.add(304);
        cards.add(305);
        cards.add(306);
        cards.add(307);
        cards.add(308);
        cards.add(309);
        cards.add(310);
        cards.add(311);
        cards.add(312);
        cards.add(313);
        //spade
        cards.add(401);
        cards.add(402);
        cards.add(403);
        cards.add(404);
        cards.add(405);
        cards.add(406);
        cards.add(407);
        cards.add(408);
        cards.add(409);
        cards.add(410);
        cards.add(411);
        cards.add(412);
        cards.add(413);
    }

    public void translate(ImageView img) {
        img.animate()
                .x(iv_released.getX())
                .y(iv_released.getY())
                .setDuration(1000)
                .start();
    } //To Move selected Card from deck to release

    public void card1click(View view) {
        Toast.makeText(MainActivity.this, "Img 1 Click", Toast.LENGTH_SHORT).show();
        iv_card1.setColorFilter(Color.argb(50, 100, 0, 0));
        translate(iv_card1);

    }
    }