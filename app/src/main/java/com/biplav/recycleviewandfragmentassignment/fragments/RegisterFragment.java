package com.biplav.recycleviewandfragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.biplav.recycleviewandfragmentassignment.R;
import com.biplav.recycleviewandfragmentassignment.functions.LoginAndRegistration;
import com.biplav.recycleviewandfragmentassignment.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment implements View.OnClickListener {

    public List<User> userList = new ArrayList<User>();
    private EditText etuserr, etpassr;
    private Button btnregister;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        etuserr = view.findViewById(R.id.etuserr);
        etpassr = view.findViewById(R.id.etpassr);
        btnregister = view.findViewById(R.id.btnregister);
        btnregister.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etuserr.getText().toString())) {
            etuserr.setError("please enter username");
        } else if (TextUtils.isEmpty(etpassr.getText().toString())) {
            etpassr.setError("please enter password");
        } else {
            userList.add(new User(etuserr.getText().toString(), etuserr.getText().toString()));
            etuserr.setText("");
            etpassr.setText("");

            Toast.makeText(getActivity(), "User Registered!!!!!" + "     " + userList.size(), Toast.LENGTH_LONG).show();
        }
    }

    public List<User> getUserList() {
        return userList;
    }
}
