package com.example.intentsproj;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_toast);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file

        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        //Creating the Toast object

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        toast.setView(layout);//setting the view of custom
        toast.show();
    }



}
