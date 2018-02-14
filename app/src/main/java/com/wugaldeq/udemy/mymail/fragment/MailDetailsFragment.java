package com.wugaldeq.udemy.mymail.fragment;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wugaldeq.udemy.mymail.R;
import com.wugaldeq.udemy.mymail.model.Mail;

/**
 * A simple {@link Fragment} subclass.
 */
public class MailDetailsFragment extends Fragment {

    private TextView textViewSubject;
    private TextView textViewSenderLetter;
    private TextView textViewSender;
    private TextView textViewMessage;

    private LinearLayout wrapper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mail_details, container, false);

        textViewSubject = view.findViewById(R.id.textViewSubject);
        textViewSenderLetter = view.findViewById(R.id.textViewSenderLetter);
        textViewSender = view.findViewById(R.id.textViewSender);
        textViewMessage = view.findViewById(R.id.textViewMessage);
        wrapper = view.findViewById(R.id.fragmentDetailsMailWrapper);
        return view;
    }

    public void renderMail(Mail mail) {
        wrapper.setVisibility(View.VISIBLE);
        textViewSubject.setText(mail.getSubject());
        textViewSender.setText(mail.getEmailAdress());
        textViewSenderLetter.setText(mail.getEmailAdress().substring(0,1).toUpperCase());
        textViewSenderLetter.getBackground().setColorFilter(Color.parseColor("#"+mail.getColor()), PorterDuff.Mode.SRC);
        textViewMessage.setText(mail.getMessage());
    }
}
