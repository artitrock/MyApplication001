package com.example.artit.myapplication001;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        textView = (TextView) findViewById(R.id.bob_text);
        textView.setText("REDMETAL");

        TextView textView2;
        textView2 = (TextView) findViewById(R.id.bob_text2);
        textView2.setText("BOB ROCK Test");

        ((TextView) findViewById(R.id.text_counter)).setText(Integer.toString(cnt));
        ((Button) findViewById(R.id.button)).setText("ลองกดดู");
        buttonToast();
    }

    public void buttonToast() {
        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                cnt++;
                Context context = getApplicationContext();
                CharSequence text = "Button pressed! : "+ Integer.toString(cnt);
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                /*TextView textView3;
                textView3 = (TextView) findViewById(R.id.text_counter);
                textView3.setText(Integer.toString(cnt));*/
                ((TextView) findViewById(R.id.text_counter)).setText(Integer.toString(cnt));

            }
        });
    }
}
