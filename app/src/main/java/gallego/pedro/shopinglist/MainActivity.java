package gallego.pedro.shopinglist;

import static gallego.pedro.shopinglist.R.id;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> test = getIntent().getStringArrayListExtra("test");


        TextView text_view1 = findViewById(id.textView1);
        TextView text_view2 = findViewById(R.id.textView2);
        TextView text_view3 = findViewById(R.id.textView3);
        TextView text_view4 = findViewById(R.id.textView4);
        TextView text_view5 = findViewById(R.id.textView5);
        TextView text_view6 = findViewById(R.id.textView6);
        TextView text_view7 = findViewById(R.id.textView7);
        TextView text_view8 = findViewById(R.id.textView8);
        TextView text_view9 = findViewById(R.id.textView9);
        TextView text_view10 = findViewById(R.id.textView10);
        TextView[] arrayTextView = {text_view1, text_view2, text_view3, text_view4, text_view5,
                text_view6, text_view7, text_view8, text_view9, text_view10};
        if (test != null) {
            for (int i = 0; i < test.size(); i++) {
                arrayTextView[i].setText(test.get(i));
            }
        }
    }

    public void nextScreen(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void findNear(View view) {
        findViewById(R.id.textView10);
        EditText textIn=findViewById(id.myLoc);
        Uri addressUri = Uri.parse("geo:0,0?q=" +textIn.getText() );
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}