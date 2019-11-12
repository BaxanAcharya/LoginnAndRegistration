package com.biplav.recycleviewandfragmentassignment.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.biplav.recycleviewandfragmentassignment.NavActivity;
import com.biplav.recycleviewandfragmentassignment.R;
import com.biplav.recycleviewandfragmentassignment.functions.LoginAndRegistration;
import com.biplav.recycleviewandfragmentassignment.model.User;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    EditText etuser, etpass;
    Button btnlogin;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        etuser = view.findViewById(R.id.etuser);
        etpass = view.findViewById(R.id.etpass);
        btnlogin = view.findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etuser.getText().toString())) {
            etuser.setError("please enter username");
        } else if (TextUtils.isEmpty(etpass.getText().toString())) {
            etpass.setError("please enter password");
        } else {
            RegisterFragment registerFragment = new RegisterFragment();
            List<User> userList = registerFragment.getUserList();

            Intent intent=new Intent(getActivity(), NavActivity.class);
            startActivity(intent);

//            for (int i = 0; i < userList.size(); i++) {
//                if(userList.get(i).getUsername().compareTo(etuser.getText().toString())==0
//                  && userList.get(i).getPassword().compareTo(etpass.getText().toString())==0){
//                    etuser.setText("");
//                    etpass.setText("");
//                    Toast.makeText(getActivity(), "Sucess", Toast.LENGTH_SHORT).show();
//                }else {
//                    etuser.setText("");
//                    etpass.setText("");
//                    Toast.makeText(getActivity(), "Username or password is incorrect", Toast.LENGTH_SHORT).show();
//                }
//            }

        }
    }
}
