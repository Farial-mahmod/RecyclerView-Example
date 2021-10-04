package com.recyclerview;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListData[] listData = new ListData[] {
                new ListData(" Map ", android.R.drawable.ic_dialog_map),
                new ListData(" Map ", android.R.drawable.ic_dialog_map),

                new ListData(" Email ", android.R.drawable.ic_dialog_email),
                new ListData(" Email ", android.R.drawable.ic_dialog_email),


                new ListData(" Info ", android.R.drawable.ic_dialog_info),
                new ListData(" Info ", android.R.drawable.ic_dialog_info),

                new ListData(" Delete ", android.R.drawable.ic_delete),
                new ListData(" Delete ", android.R.drawable.ic_delete),

                new ListData(" Dialer ", android.R.drawable.ic_dialog_dialer),
                new ListData(" Dialer ", android.R.drawable.ic_dialog_dialer),

                new ListData(" Alert ", android.R.drawable.ic_dialog_alert),
                new ListData(" Alert ", android.R.drawable.ic_dialog_alert),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ListAdapter adapter = new ListAdapter(listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
