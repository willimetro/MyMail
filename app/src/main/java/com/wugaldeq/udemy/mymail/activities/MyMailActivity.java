package com.wugaldeq.udemy.mymail.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wugaldeq.udemy.mymail.R;
import com.wugaldeq.udemy.mymail.fragment.ListMailFragment;
import com.wugaldeq.udemy.mymail.model.Mail;

public class MyMailActivity extends AppCompatActivity implements ListMailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_mail);
    }

    @Override
    public void OnListClick(Mail mail) {
        Intent detailIntent = new Intent(this, MyMailDetailActivity.class);
        detailIntent.putExtra("subject",mail.getSubject());
        detailIntent.putExtra("message",mail.getMessage());
        detailIntent.putExtra("sender",mail.getEmailAdress());
        detailIntent.putExtra("color",mail.getColor());
        startActivity(detailIntent);
    }
}
