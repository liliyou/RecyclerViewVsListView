package android.lili.com.recyclerviewvslistview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by lili on 2016/1/13.
 */
public class TestRecyclerView extends RecyclerView {

    static int listSize = 0;

    public TestRecyclerView(Context context) {

        super(context);
    }

    public TestRecyclerView(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
    }

    public TestRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
    }

    public void setListSize(int listSize) {

        this.listSize = listSize;
        Log.e("listSize1", "" + listSize);
        ;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        super.onSizeChanged(w, h, oldw, oldh);
        int x = getScrollX();
        int y = getScrollX();

        Log.e("TestRecyclerView", "x " + x);
        Log.e("TestRecyclerView", "y " + y);
        Log.e("TestRecyclerView", "w " + w);
        Log.e("TestRecyclerView", "h " + h);
        Log.e("TestRecyclerView", "oldw " + oldw);
        Log.e("TestRecyclerView", "oldh " + oldh);
//        Log.e("ItemCount", "" + getAdapter().getItemCount());
        //        scrollToPosition(getAdapter().getItemCount());
        //        scrollToPosition(19);
    }


}
