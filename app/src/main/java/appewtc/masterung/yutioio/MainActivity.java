package appewtc.masterung.yutioio;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.IOIOLooper;
import ioio.lib.util.android.IOIOActivity;

public class MainActivity extends IOIOActivity implements View.OnClickListener {

    private Button button;
    private String tag = "7AprilV1";
    private boolean aBoolean = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View
        initialView();

        //Button Controller
        button.setOnClickListener(MainActivity.this);

    }   // Main Method

    class Looper extends BaseIOIOLooper {

        @Override
        protected void setup() throws ConnectionLostException, InterruptedException {
            //super.setup();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getApplicationContext(), "Connected IOIO OK",
                            Toast.LENGTH_SHORT).show();
                    button.setText("Connected OK");
                }
            });

        }   // setup

        @Override
        public void loop() throws ConnectionLostException, InterruptedException {
            //super.loop();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                Log.d(tag, "e loop ==> " + e.toString());
            }
        }   // loop

    }   // Looper Class

    protected IOIOLooper createIOIOLooper() {

        return new Looper();
    }



    private void initialView() {
        button = (Button) findViewById(R.id.btnCheck);
    }

    @Override
    public void onClick(View view) {

    }   // onClick

}   // Main Class
