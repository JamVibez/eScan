package beast.escan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LidlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

    protected void  scaner(View view) {
        Intent intent = new Intent(LidlActivity.this, MainActivity.class);
        startActivity(intent);
    }

}