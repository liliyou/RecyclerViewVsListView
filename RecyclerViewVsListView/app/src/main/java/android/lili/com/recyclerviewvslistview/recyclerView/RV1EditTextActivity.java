package android.lili.com.recyclerviewvslistview.recyclerView;

import android.lili.com.recyclerviewvslistview.R;
import android.lili.com.recyclerviewvslistview.TestRecyclerView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import java.util.ArrayList;

public class RV1EditTextActivity extends AppCompatActivity {

    private TestRecyclerView recyclerView;
    private RecyclerViewAdapter recyclerAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_edittext);
        initView();
        getData();
        setRecycleView();
    }

    private void getData() {

        for (int i = 0; i < 19; i++) {
            String stringValue = Integer.toString(i);
            arrayList.add(stringValue);
        }
    }

    private void initView() {

        recyclerView = (TestRecyclerView) findViewById(R.id.recycler_view);
    }



    private void setRecycleView() {

        Log.e("arrayList",""+arrayList.size());
        recyclerView.setListSize(arrayList.size());
        recyclerAdapter = new RecyclerViewAdapter(this, arrayList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
