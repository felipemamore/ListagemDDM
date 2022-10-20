package ifsc.erbs.myarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String>adapter;
    FrutaController frutaController;
    FrutaAdapter frutaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        frutaController = new FrutaController();


        FrutaAdapter frutaAdapter = new FrutaAdapter(
                getApplicationContext(), R.layout.item_fruta,
                frutaController.FRUTAS
        );


    }

    @Override
    protected void onStart() {
        super.onStart();
        listView.setAdapter(frutaAdapter);

    }
}