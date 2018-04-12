package beast.escan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "beast.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void eleclerc(View view) {
        Intent intent = new Intent(LoginActivity.this, EleclercActivity.class);
        String message = "E.Leclerc";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void carrefour(View view) {
        Intent intent = new Intent(LoginActivity.this, CarrefourActivity.class);
        String message = "Carrefour";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void auchan(View view) {
        Intent intent = new Intent(LoginActivity.this, AuchanActivity.class);
        String message = "Auchan";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void tesco(View view) {
        Intent intent = new Intent(LoginActivity.this, TescoActivity.class);
        String message = "Tesco";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void lidl(View view) {
        Intent intent = new Intent(LoginActivity.this, LidlActivity.class);
        String message = "Lidl";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
