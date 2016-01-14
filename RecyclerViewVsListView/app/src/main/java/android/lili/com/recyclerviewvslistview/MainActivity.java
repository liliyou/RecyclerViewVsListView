package android.lili.com.recyclerviewvslistview;

import android.content.Intent;
import android.lili.com.recyclerviewvslistview.listView.LV1EditTextActivity;
import android.lili.com.recyclerviewvslistview.listView.ListViewActivity;
import android.lili.com.recyclerviewvslistview.recyclerView.RV1EditTextActivity;
import android.lili.com.recyclerviewvslistview.recyclerView.RV2ScrollListenerActivity;
import android.lili.com.recyclerviewvslistview.recyclerView.RV3ScrollButtonActivity;
import android.lili.com.recyclerviewvslistview.recyclerView.RecyclerViewActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button listview;
    Button recyclerview;
    Button btnRvEdit;
    Button btnLvEdit;
    Button btnRvListener;
    Button  btnRvScrollButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        initView();

    }

    private void getData() {

    }

    private void initView() {

        listview = (Button) findViewById(R.id.list_view);
        recyclerview = (Button) findViewById(R.id.recycler_view);
        btnLvEdit = (Button) findViewById(R.id.btnLvEdit);
        btnRvEdit = (Button) findViewById(R.id.btnRvEdit);
        btnRvListener = (Button) findViewById(R.id.btnRvListener);
        btnRvScrollButton = (Button) findViewById(R.id.btnRvScrollButton);
        recyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        btnRvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RV1EditTextActivity.class);
                startActivity(intent);
            }
        });
        btnLvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LV1EditTextActivity.class);
                startActivity(intent);
            }
        });
        btnRvListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RV2ScrollListenerActivity.class);
                startActivity(intent);
            }
        });
        btnRvScrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RV3ScrollButtonActivity.class);
                startActivity(intent);
            }
        });
    }

}
