package com.wugaldeq.udemy.mymail.adapaters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wugaldeq.udemy.mymail.R;
import com.wugaldeq.udemy.mymail.model.Mail;

import java.util.List;

/**
 * Adaptador para mostrar los correos dentro del listView
 * Created by wugaldeq on 14-02-2018.
 */

public class MailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> mails;

    public MailAdapter(Context context, int layout, List<Mail> mails) {
        this.context = context;
        this.layout = layout;
        this.mails = mails;
    }

    @Override
    public int getCount() {
        return mails.size();
    }

    @Override
    public Mail getItem(int position) {
        return mails.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            view = LayoutInflater.from(context).inflate(layout,null);
            holder = new ViewHolder();
            holder.subject = view.findViewById(R.id.textViewListSubject);
            holder.message = view.findViewById(R.id.textViewListMessage);
            holder.sender = view.findViewById(R.id.textViewListSenderName);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Mail currentMail = getItem(position);

        String subject;
        int SUBJECT_MAX_LENGHT = 40;
        if(currentMail.getSubject().length() > SUBJECT_MAX_LENGHT){
            subject = currentMail.getSubject().substring(0, SUBJECT_MAX_LENGHT)+"...";
        } else {
            subject = currentMail.getSubject();
        }
        String message;
        int MESSAGE_MAX_LENGHT = 80;
        if(currentMail.getMessage().length() > MESSAGE_MAX_LENGHT){
            message = currentMail.getMessage().substring(0, MESSAGE_MAX_LENGHT)+"...";
        } else {
            message = currentMail.getMessage();
        }
        holder.subject.setText(subject);
        holder.message.setText(message);
        holder.sender.setText(currentMail.getMessage().substring(0,1));
        holder.sender.getBackground().setColorFilter(Color.parseColor("#"+currentMail.getColor()), PorterDuff.Mode.SRC);
        return view;
    }

    private static class ViewHolder{
        private TextView subject;
        private TextView message;
        private TextView sender;
    }
}
