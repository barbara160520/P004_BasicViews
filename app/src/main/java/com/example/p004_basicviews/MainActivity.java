package com.example.p004_basicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button arrow_button;
    private ImageButton imageButton;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
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
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        arrow_button = (Button)findViewById(R.id.arrow_button);

        //сокрытие строки состояния и навигации
        /*decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(uiOptions);*/


        imageButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton.setImageResource(R.drawable.card2);
                else
                    // возвращаем первую картинку
                    imageButton.setImageResource(R.drawable.card1);
                flag = !flag;
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton1.setImageResource(R.drawable.card3);
                else
                    // возвращаем первую картинку
                    imageButton1.setImageResource(R.drawable.card2);
                flag = !flag;
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton2.setImageResource(R.drawable.card4);
                else
                    // возвращаем первую картинку
                    imageButton2.setImageResource(R.drawable.card3);
                flag = !flag;
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton3.setImageResource(R.drawable.card5);
                else
                    // возвращаем первую картинку
                    imageButton3.setImageResource(R.drawable.card4);
                flag = !flag;
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton4.setImageResource(R.drawable.card6);
                else
                    // возвращаем первую картинку
                    imageButton4.setImageResource(R.drawable.card5);
                flag = !flag;
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton5.setImageResource(R.drawable.card1);
                else
                    // возвращаем первую картинку
                    imageButton5.setImageResource(R.drawable.card6);
                flag = !flag;
            }
        });

    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }



}