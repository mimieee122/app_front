package com.example.hiandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button b = findViewById(R.id.but1);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),
//                        "b.seton으로 누름",Toast.LENGTH_LONG).show();
//            }
//        });
    }

    //public void onC(View v){
        // Toast.makeText(getApplicationContext(),"onC누름",Toast.LENGTH_LONG).show();
        // 위 문장 쓰니까 버튼 눌렀을 때 "onC누름" 이라고 뜸 !
        // 버튼이 하나일 때만 가능한 방법.
    //}
}
