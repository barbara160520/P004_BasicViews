package com.example.p004_basicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        arrow_button = (Button)findViewById(R.id.arrow_button);

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
        /*arrow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}