package gallego.pedro.shopinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends AppCompatActivity {

    private static final List<String> test     = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);

    }


    public void addAzucar(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Azucar")){
            test.add("Azucar");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }

    public void addLeche(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Leche")){
            test.add("Leche");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }
    public void addHarina(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Harina")){
            test.add("Harina");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }

    public void addMantequilla(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Mantequilla")){
            test.add("Mantequilla");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }
    public void addSal(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Sal")){
            test.add("Sal");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }
    public void addAceite(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Aceite")){
            test.add("Aceite");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            startActivity(intent);
        }
    }

    public void addLevadura(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Levadura")){
            test.add("Levadura");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }
    public void addCacao(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Cacao")){
            test.add("Cacao");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }

    public void addCafe(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Cafe")){
            test.add("Cafe");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }

    public void addChocolate(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        if(!test.contains("Chocolate")){
            test.add("Chocolate");
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
        }else{
            intent.putStringArrayListExtra("test", (ArrayList<String>) test);
            startActivity(intent);
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        intent.putStringArrayListExtra("test", (ArrayList<String>) test);
        startActivity(intent);
    }

}