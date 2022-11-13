package com.bytedance.club.adapter.person.personcenter.adapter;

import static com.bytedance.club.adapter.person.personcenter.adapter.ProblemAdapter.TYPE_ONE;
import static com.bytedance.club.adapter.person.personcenter.adapter.ProblemAdapter.TYPE_TWO;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bytedance.club.R;
import com.bytedance.club.adapter.person.personcenter.UserHelpDetailsActivity;
import com.bytedance.club.adapter.person.personcenter.bean.ProblemBean;

import java.util.List;


public class ProblemItemAdapter extends RecyclerView.Adapter<ProblemItemAdapter.RecomHolder> {

    private final LayoutInflater mInflater;
    private final Context mContext;
    private final int mType;
    private final List<ProblemBean.ResultData.Data.list> mProblemBeanList;

    public ProblemItemAdapter(Context context, int type, List<ProblemBean.ResultData.Data.list> ProblemBeanList) {
        super();
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mProblemBeanList = ProblemBeanList;
        this.mType = type;
    }

    @NonNull
    @Override
    public RecomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View convertView = mInflater.inflate(R.layout.problem_type_item, viewGroup, false);
        RecomHolder holder = new RecomHolder(convertView);
        convertView.setTag(holder);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull final RecomHolder holder, final int position) {
        ProblemBean.ResultData.Data.list mProblem = mProblemBeanList.get(position);
        switch (mType) {
            case TYPE_ONE:
            case TYPE_TWO:
                holder.mTvName.setText(mProblem.title);
                if (mProblemBeanList != null) {
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent();
                            intent.setClass(mContext, UserHelpDetailsActivity.class);
                            intent.putExtra("id", Integer.parseInt(mProblem.id));
                            mContext.startActivity(intent);
                        }
                    });
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mProblemBeanList.size();
    }

    public static class RecomHolder extends RecyclerView.ViewHolder {
        public TextView mTvName;

        public RecomHolder(View itemView) {
            super(itemView);
            mTvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
