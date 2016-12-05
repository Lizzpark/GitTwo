package com.example.administrator.gittwo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//用git管理之后 提交过一次之后 再次修改代码 与上次提交有不同之处的代码会显示蓝色


public class MainActivity extends Activity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.tv_main);
        button= (Button) findViewById(R.id.btn_press);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("哇哇哇，点击按钮之后显示的文字变化了吧");
            }
        });
    }
}
