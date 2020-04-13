package com.example.testmasha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Test>  questions;
    TextView quest, answer1,answer2,answer3,answer4;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quest=findViewById(R.id.textviewQust);
        answer1=findViewById(R.id.textviewanswer1);
        answer2=findViewById(R.id.textviewanswer2);
        answer3=findViewById(R.id.textviewanswer3);
        answer4=findViewById(R.id.textviewanswer4);
        WritingNo one=new WritingNo("1111110","2222222220","333333333330","444444444440","555550");
        WritingNo two=new WritingNo("1111116","2222222226","333333333336","444444444446","555556");
        WritingNo three=new WritingNo("1111117","2222222227","333333333337","444444444447","555557");
        WritingNo fore=new WritingNo("1111118","2222222228","333333333338","444444444448","555558");
        questions= new ArrayList<>();
        questions.add(one);
        questions.add(two);
        questions.add(three);
        questions.add(fore);
        count=0;
    }

    public void nextqust(View view) {
        if(count<4){
        quest.setText(((WritingNo)questions.get(count)).getQuestion());
        answer1.setText(((WritingNo)questions.get(count)).getRightanswer());
        answer2.setText(((WritingNo)questions.get(count)).getWronganserone());
        answer3.setText(((WritingNo)questions.get(count)).getWrongansertwo());
        answer4.setText(((WritingNo)questions.get(count)).getWronganserthree());}
        count++;

    }
}
