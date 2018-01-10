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
        //把寫好的Runnable() 放到handler
        handler.post(r);
    }
    //直接在主執行緒上面寫Runnable() interface
    Runnable r = new Runnable() {
        @Override
        public void run() {
            tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
            //每隔1秒再將任務給handler
            handler.postDelayed(r, 1000);
        }
    };
}
