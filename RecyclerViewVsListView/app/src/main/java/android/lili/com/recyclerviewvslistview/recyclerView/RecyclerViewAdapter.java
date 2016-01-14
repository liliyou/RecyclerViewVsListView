package android.lili.com.recyclerviewvslistview.recyclerView;

import android.content.Context;
import android.lili.com.recyclerviewvslistview.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lili on 2015/8/17.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.NormalTextViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context context;
    private ArrayList<String> arrayList;

    public RecyclerViewAdapter(Context context, ArrayList<String> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NormalTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new NormalTextViewHolder(mLayoutInflater.inflate(R.layout.item_1, parent, false));
    }

    @Override
    public void onBindViewHolder(final NormalTextViewHolder holder, int position) {



        holder.txtNotice.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {

        return arrayList == null ? 0 : arrayList.size();
    }

    public static class NormalTextViewHolder extends RecyclerView.ViewHolder {

        TextView txtNotice;

        NormalTextViewHolder(View view) {

            super(view);
            txtNotice = (TextView) view.findViewById(R.id.txtNotice);
        }
    }
}