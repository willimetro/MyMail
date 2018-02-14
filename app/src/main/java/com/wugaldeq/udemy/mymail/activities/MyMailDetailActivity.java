package com.wugaldeq.udemy.mymail.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wugaldeq.udemy.mymail.R;
import com.wugaldeq.udemy.mymail.fragment.MailDetailsFragment;
import com.wugaldeq.udemy.mymail.model.Mail;

public class MyMailDetailActivity extends AppCompatActivity {

    private String subject;
    private String message;
    private String sender;
    private String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_mail_detail);

        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("sender");
            color = getIntent().getStringExtra("color");
        }

        Mail mail = new Mail();
        mail.setSubject(subject);
        mail.setColor(color);
        mail.setMessage(message);
        mail.setEmailAdress(sender);

        MailDetailsFragment detailsFragment = (MailDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);
    }
}
