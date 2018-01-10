package tw.com.pcschool.dd2018011001;

import android.os.Handler;
import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        tv = findViewById(R.id.textView);
        handler.post(r);
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
            handler.postDelayed(r, 1000);
        }
    };
}
