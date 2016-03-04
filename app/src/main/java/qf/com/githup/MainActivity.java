package qf.com.githup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    /**
     * 耿伟
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //啊舒服撒
        //我是傅晴望
        //耿伟
        textView= (TextView) findViewById(R.id.tv);
    }
}
