package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.bean.Bean;

import java.util.List;

public class AdAp extends RecyclerView.Adapter<AdAp.ViewH> {
    List<Bean> bean;

    public AdAp(List<Bean> bean) {
        this.bean = bean;
    }

    @NonNull
    @Override
    public ViewH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_op, null);
        ViewH viewH = new ViewH(inflate);
        return viewH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewH viewH, int i) {
        viewH.tv.setText(bean.get(i).getName());
        Glide.with(viewH.iv.getContext()).load(bean.get(i).getImg()).into(viewH.iv);
    }

    @Override
    public int getItemCount() {
        return bean.size();
    }

    public class ViewH extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public ViewH(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
