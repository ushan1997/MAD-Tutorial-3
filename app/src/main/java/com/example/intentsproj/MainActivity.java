package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text1 = (EditText) findViewById(R.id.editTextNumber1);
        final EditText text2 = (EditText) findViewById(R.id.editTextNumber2);

        Button ok_btn = (Button) findViewById(R.id.button_1);

        ok_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);


                intent.putExtra("num1",text1.getText().toString());
                intent.putExtra("num2",text2.getText().toString());

                startActivity(intent);

//                Context context = getApplicationContext(); //The context touse. Usually your Application or Activity object
//                CharSequence message = "You just clicked the OK button + num1"; //Display string
//                int duration = Toast.LENGTH_SHORT;//How long the toast message will lasts
//                Toast toast = Toast.makeText(context, message, duration);
//                toast.setGravity(Gravity.TOP|Gravity.LEFT, 200, 1000);//Positioning the Toast
//                toast.show();

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));//Creating the Toast object

                 Toast toast = new Toast(getApplicationContext());
                 toast.setDuration(Toast.LENGTH_SHORT);
                 toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                 toast.setView(layout);//setting the view of custom toast layout
                 toast.show();




            }
        });

    }


}
