package com.example.kadi.bitbull;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Pitbull;
    private View view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //see tegevus võimaldab sul nuppule vajutamisel avada vaabileht
        Pitbull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://dogtime.com/dog-breeds/american-pit-bull-terrier#/slide/1";

                        Intent intent= new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);





            }
        });

    }
    public void Pildid (View view ){
        Intent intent= new Intent(MainActivity.this,Activity_Pildid.class);
        startActivity(intent);
    }

     {
    }
}
