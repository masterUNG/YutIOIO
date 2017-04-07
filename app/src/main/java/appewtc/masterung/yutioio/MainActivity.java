package appewtc.masterung.yutioio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View
        initialView();

        //Button Controller
        button.setOnClickListener(MainActivity.this);

    }   // Main Method

    private void initialView() {
        button = (Button) findViewById(R.id.btnCheck);
    }

    @Override
    public void onClick(View view) {

    }   // onClick

}   // Main Class
