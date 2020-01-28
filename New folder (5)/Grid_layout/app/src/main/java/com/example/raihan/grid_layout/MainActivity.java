package com.example.raihan.grid_layout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayname[]={"Facebook"," youtube","Twitter"};







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CircleMenu circleMenu=(CircleMenu)findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.like, R.drawable.success)
                .addSubMenu(Color.parseColor("#FF4081"),R.drawable.facebook)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.twitter)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.youtube)


                .setOnMenuSelectedListener(new OnMenuSelectedListener() {


                    @Override
                    public void onMenuSelected(int index) {



                        Toast.makeText(MainActivity.this, "you selected" + arrayname[index], Toast.LENGTH_SHORT).show();

                    }
                }) ;






    }
}
