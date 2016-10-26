package adrian.engforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    Button naukaButton;
    Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Initialization();
    }

    private void Initialization(){
        naukaButton = (Button) findViewById(R.id.NaukaButton);
        testButton = (Button) findViewById(R.id.TestButton);
    }


}
