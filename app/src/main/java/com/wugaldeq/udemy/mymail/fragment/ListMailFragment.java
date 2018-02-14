package com.wugaldeq.udemy.mymail.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.wugaldeq.udemy.mymail.R;
import com.wugaldeq.udemy.mymail.adapaters.MailAdapter;
import com.wugaldeq.udemy.mymail.model.Mail;
import com.wugaldeq.udemy.mymail.utils.Util;

import java.util.List;


/**
 * Clase "fragmento" que lista los correos en la aplicación
 * A simple {@link Fragment} subclass.
 */
public class ListMailFragment extends Fragment {

    private List<Mail> mails;
    private OnFragmentInteractionListener mListener;

    public ListMailFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ListView listView;
        View view = inflater.inflate(R.layout.fragment_list_mail, container, false);
        listView = view.findViewById(R.id.listViewMail);
        mails = Util.getDummyData();
        MailAdapter mailAdapter = new MailAdapter(getContext(),R.layout.list_view_mail,mails);
        listView.setAdapter(mailAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                mListener.OnListClick(mails.get(position));
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void OnListClick(Mail mail);
    }
}
