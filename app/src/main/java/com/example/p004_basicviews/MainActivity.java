package com.example.p004_basicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button arrow_button;
    private ImageButton solarButton;
    private ImageButton himiyaButton;
    private ImageButton fishButton;
    private ImageButton matButton;
    private ImageButton skeletonButton;
    private ImageButton slonButton;
    private boolean flag = true;
    //int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
    //View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //перекрытие разметки (панель накладывается на разметку)
        //getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        //setContentView(R.layout.activity_main);

        //сокрытие строки состояния и маскировка навигации
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        setContentView(R.layout.activity_main);
        solarButton = (ImageButton)findViewById(R.id.solarButton);
        himiyaButton = (ImageButton)findViewById(R.id.himiyaButton);
        fishButton = (ImageButton)findViewById(R.id.fishButton);
        matButton = (ImageButton)findViewById(R.id.matButton);
        skeletonButton = (ImageButton)findViewById(R.id.skeletonButton);
        slonButton = (ImageButton)findViewById(R.id.slonButton);
        arrow_button = (Button)findViewById(R.id.arrow_button);

        //сокрытие строки состояния и навигации
        /*decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(uiOptions);*/


        solarButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    solarButton.setImageResource(R.drawable.card2);
                else
                    // возвращаем первую картинку
                    solarButton.setImageResource(R.drawable.card1);
                flag = !flag;
            }
        });
        himiyaButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    himiyaButton.setImageResource(R.drawable.card3);
                else
                    // возвращаем первую картинку
                    himiyaButton.setImageResource(R.drawable.card2);
                flag = !flag;
            }
        });
        fishButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    fishButton.setImageResource(R.drawable.card4);
                else
                    // возвращаем первую картинку
                    fishButton.setImageResource(R.drawable.card3);
                flag = !flag;
            }
        });
        matButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    matButton.setImageResource(R.drawable.card5);
                else
                    // возвращаем первую картинку
                    matButton.setImageResource(R.drawable.card4);
                flag = !flag;
            }
        });
        skeletonButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    skeletonButton.setImageResource(R.drawable.card6);
                else
                    // возвращаем первую картинку
                    skeletonButton.setImageResource(R.drawable.card5);
                flag = !flag;
            }
        });
        slonButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    slonButton.setImageResource(R.drawable.card1);
                else
                    // возвращаем первую картинку
                    slonButton.setImageResource(R.drawable.card6);
                flag = !flag;
            }
        });

    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }



}