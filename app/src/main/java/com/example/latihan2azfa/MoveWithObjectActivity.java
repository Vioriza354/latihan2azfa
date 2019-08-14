package com.example.latihan2azfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {
    public static String EXTRA_PERSON = " extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person jelema = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : "+jelema.getName()+
                ", Email : " +jelema.getEmail() +
                "Age :" +jelema.getAge()+
                ", Location : "
                +jelema.getCity();
        tvObject.setText(text);
    }
}
