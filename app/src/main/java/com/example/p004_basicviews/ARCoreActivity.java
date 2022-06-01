package com.example.p004_basicviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ARCoreActivity extends AppCompatActivity {

    private TextView nameModel;
    private ConstraintLayout constraintLayout;
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //сокрытие строки состояния и маскировка навигации
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        setContentView(R.layout.activity_arcore);

        nameModel = (TextView)findViewById(R.id.nameModel);
        String name = getIntent().getExtras().get("name").toString();
        nameModel.setText(name);

        constraintLayout = findViewById(R.id.card_layout);
        swipeListener = new ARCoreActivity.SwipeListener(constraintLayout);
    }
    public void goBack(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }


    //обработчик движения
    private class SwipeListener  implements View.OnTouchListener {

        GestureDetector gestureDetector;
        //конструктор
        SwipeListener(View view){
            int threshold = 100;
            int velocity_threshold = 100;

            GestureDetector.SimpleOnGestureListener listener =
                    new GestureDetector.SimpleOnGestureListener(){
                        @Override
                        public boolean onDown(MotionEvent e) {
                            //pass true value
                            return  true;
                        }

                        @Override
                        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {                            //get x and y difference
                            float xDiff = e2.getX() - e1.getX();
                            float yDiff = e2.getY() - e1.getY();
                            try {
                                //проверка условия
                                if (Math.abs(xDiff) > Math.abs(yDiff)){
                                    //Когда х больше у

                                    //проверка условия
                                    if(Math.abs(xDiff) > threshold && Math.abs(velocityX) > velocity_threshold){
                                        //When x difference is greater than threshold
                                        //When x velocity is greater than velocity threshold

                                        //проверка условия
                                        if (xDiff > 0){
                                            //Когда смахивание в право
                                            Intent intent = new Intent(ARCoreActivity.this,MainActivity.class);
                                            startActivity(intent);
                                            ARCoreActivity.this.finish();

                                        }else {
                                            //Когда смахивание в лево

                                        }
                                        return true;
                                    }
                                }else {
                                    //Когда у больше х

                                    //проверка условия
                                    if(Math.abs(yDiff)>threshold&&Math.abs(velocityY)>velocity_threshold){
                                        //When y difference is greater than threshold
                                        //When y velocity is greater than velocity threshold

                                        if (yDiff>0){
                                            //Когда смахивание вниз
                                        }else{
                                            //Когда смахивание вверх
                                        }
                                        return true;
                                    }
                                }
                            }
                            catch (Exception e){
                                e.printStackTrace();
                            }
                            return false;
                        }
                    };
            //детектор
            gestureDetector = new GestureDetector(listener);
            //set listener on view
            view.setOnTouchListener(this);

        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            //Return gesture event
            return gestureDetector.onTouchEvent(event);
        }
    }
}