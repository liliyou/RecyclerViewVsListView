package android.lili.com.recyclerviewvslistview.recyclerView;

import android.lili.com.recyclerviewvslistview.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class RV3ScrollButtonActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();
    private Button btnClearAll;
    private Button btnAddFirst;
    private Button btnRemoveFirst;
    private Button btnAddLast;
    private Button btnRemoveLast;
    private Button btnNotifyDataSetChanged;
    private Button btnNotifyItemInserted;
    private Button btnAddAndNotifyItemInserted;
    private Button btnAddAndNotifyDataSetChanged;

    private Button btnAddBottomAndNotifyItemInserted;
    private Button btnAddBottomAndNotifyDataSetChanged;
    private Button btnNotifyItemRemoved;
    private Button btnNotifyItemRemovedBottom;
    private Button btnNotifyItemRangeRemoved;
    private Button btnRemoveFirstNotifyItemRemoved;
    private Button btnRemoveBottomNotifyItemRemoved;
    private Button btnRemoveAboveBottomNotifyItemRemoved;
    private Button btnAddAndNotifyItemRangeChanged;
    private Button btnNotifyItemMoved;
    private TextView txtNote;
    private int AllNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_insert);


        initView();
        getData();
        setRecycleView();
    }

    private void getData() {

        for (int i = 0; i < 10; i++) {
            AllNum = i;
            String stringValue = Integer.toString(i);
            arrayList.add(stringValue);
        }
    }

    private void initView() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        btnClearAll = (Button) findViewById(R.id.btnClearAll);
        btnAddFirst = (Button) findViewById(R.id.btnAddFirst);
        btnRemoveFirst = (Button) findViewById(R.id.btnRemoveFirst);
        btnAddLast = (Button) findViewById(R.id.btnAddLast);
        btnRemoveLast = (Button) findViewById(R.id.btnRemoveLast);
        btnNotifyItemRemoved = (Button) findViewById(R.id.btnNotifyItemRemoved);
        btnNotifyItemRemovedBottom = (Button) findViewById(R.id.btnNotifyItemRemovedBottom);
        btnNotifyItemRangeRemoved = (Button) findViewById(R.id.btnNotifyItemRangeRemoved);
        btnRemoveFirstNotifyItemRemoved = (Button) findViewById(R.id.btnRemoveFirstNotifyItemRemoved);
        btnRemoveBottomNotifyItemRemoved = (Button) findViewById(R.id.btnRemoveBottomNotifyItemRemoved);
        btnRemoveAboveBottomNotifyItemRemoved = (Button) findViewById(R.id.btnRemoveAboveBottomNotifyItemRemoved);
        btnNotifyDataSetChanged = (Button) findViewById(R.id.btnNotifyDataSetChanged);
        btnNotifyItemInserted = (Button) findViewById(R.id.btnNotifyItemInserted);
        btnAddAndNotifyItemInserted = (Button) findViewById(R.id.btnAddAndNotifyItemInserted);
        btnAddAndNotifyDataSetChanged = (Button) findViewById(R.id.btnAddAndNotifyDataSetChanged);

        btnAddBottomAndNotifyItemInserted = (Button) findViewById(R.id.btnAddBottomAndNotifyItemInserted);
        btnAddBottomAndNotifyDataSetChanged = (Button) findViewById(R.id.btnAddBottomAndNotifyDataSetChanged);
        btnAddAndNotifyItemRangeChanged = (Button) findViewById(R.id.btnAddAndNotifyItemRangeChanged);
        btnNotifyItemMoved = (Button) findViewById(R.id.btnNotifyItemMoved);
        txtNote = (TextView) findViewById(R.id.txtNote);
        btnClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.clear();
                recyclerAdapter.notifyDataSetChanged();
                AllNum = 0;
                txtNote.setText("清除了所有的item");
            }
        });
        btnAddFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(0, stringValue);
                txtNote.setText("增加了一個item到列表前面，可以按下btnNotifyDataSetChanged 或 btnNotifyItemInserted 理解差別");
            }
        });
        btnAddLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(stringValue);
                txtNote.setText("增加了一個item到列表後面，可以按下btnNotifyDataSetChanged ");

            }
        });
        btnRemoveFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(0);
                AllNum = AllNum - 1;
                txtNote.setText("移除了第一個item");
            }
        });

        btnRemoveLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(AllNum);
                AllNum = AllNum - 1;
                txtNote.setText("移除了最後一個item");
            }
        });
        btnNotifyDataSetChanged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerAdapter.notifyDataSetChanged();
                txtNote.setText("更新了畫面上的item");
            }
        });

        btnNotifyItemInserted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerAdapter.notifyItemInserted(0);
                txtNote.setText("插入更新了畫面上第一個item");
            }
        });
        btnAddAndNotifyItemInserted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(0, stringValue);
                recyclerAdapter.notifyItemInserted(0);
                txtNote.setText("增加了一個item到列表前面，插入更新了畫面上第一個item");
            }
        });
        btnAddAndNotifyDataSetChanged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(0, stringValue);
                recyclerAdapter.notifyDataSetChanged();
                txtNote.setText("增加了一個item到列表後面，插入更新了畫面上的所有item");

            }
        });
        btnAddBottomAndNotifyItemInserted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(arrayList.size(), stringValue);
                recyclerView.scrollToPosition(arrayList.size() - 1);
                //                recyclerView.setItemAnimator(new ScaleInRightAnimator(new OvershootInterpolator(1f)));
                //                recyclerView.getItemAnimator().setAddDuration(1000);
                //                recyclerView.getItemAnimator().setRemoveDuration(1000);
                //                recyclerAdapter.notifyItemInserted(arrayList.size()-1);
                txtNote.setText("增加了一個item到列表後面，插入更新了畫面上最後一個item");

            }
        });
        btnAddBottomAndNotifyDataSetChanged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                arrayList.add(stringValue);
                recyclerAdapter.notifyDataSetChanged();
                txtNote.setText("增加了一個item到列表後面，更新了畫面上的所有item");

            }
        });
        btnAddAndNotifyItemRangeChanged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllNum = AllNum + 1;
                String stringValue = Integer.toString(AllNum);
                AllNum = AllNum + 1;
                String stringValue2 = Integer.toString(AllNum);
                AllNum = AllNum + 1;
                String stringValue3 = Integer.toString(AllNum);

                arrayList.add(0, stringValue);
                arrayList.add(0, stringValue2);
                arrayList.add(0, stringValue3);
                recyclerAdapter.notifyItemRangeChanged(0, 3);
                txtNote.setText("增加了三個item到列表前面，更新了畫面上的前三個item");
            }
        });
        btnNotifyItemRemoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerAdapter.notifyItemRemoved(0);
                txtNote.setText("移除更新了畫面上第一個item");
            }
        });
        btnNotifyItemRemovedBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerAdapter.notifyItemRemoved(AllNum + 1);
                txtNote.setText("移除更新了畫面上最後一個item");
            }
        });

        btnNotifyItemRangeRemoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(AllNum);
                AllNum = AllNum - 1;
                arrayList.remove(AllNum);
                AllNum = AllNum - 1;
                recyclerAdapter.notifyItemRangeRemoved(AllNum - 3, 2);
                txtNote.setText("移除了最後兩個item，並且移除更新了畫面上最後兩個item");
            }
        });
        btnRemoveFirstNotifyItemRemoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(0);
                AllNum = AllNum - 1;
                recyclerAdapter.notifyItemRemoved(0);
                txtNote.setText("移除了第一個item，並且並且移除更新了畫面上最後一個item");
            }
        });
        btnRemoveBottomNotifyItemRemoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(AllNum);
                AllNum = AllNum - 1;
                recyclerAdapter.notifyItemRemoved(AllNum + 1);
                txtNote.setText("移除了最後一個item，並且移除更新了畫面上最後一個item");
            }
        });
        btnRemoveAboveBottomNotifyItemRemoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.remove(AllNum);
                AllNum = AllNum - 1;
                recyclerAdapter.notifyItemRemoved(AllNum);
                txtNote.setText("移除了最後一個item，但移除更新了畫面上最後第二個item，按下NotifyDataSetChanged 看真相");
            }
        });

        btnNotifyItemMoved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recyclerAdapter.notifyItemMoved(0, 5);
                txtNote.setText("只有動畫的0=>5移動");

            }
        });
    }


    private void setRecycleView() {

        recyclerAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

    }
}
