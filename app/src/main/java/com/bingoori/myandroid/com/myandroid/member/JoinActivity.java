package com.bingoori.myandroid.com.myandroid.member;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bingoori.myandroid.R;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        findViewById(R.id.joinAddquery).setOnClickListener(this);
        findViewById(R.id.joinCheckQuery).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        MemberService service = new MemberServiceImpl();
        MemberDTO member = new MemberDTO();
        EditText uid = (EditText)findViewById(R.id.joinId);
        EditText psw = (EditText)findViewById(R.id.joinPassword);
        EditText name = (EditText)findViewById(R.id.joinName);

        member.setName(uid.getText().toString());
        member.setPassword(psw.getText().toString());
        member.setName(name.getText().toString());

        switch (v.getId()){
            case R.id.joinAddquery :
                Toast.makeText(this,"joinAddquery",Toast.LENGTH_LONG).show();
                service.addMember(member);
                break;
            case R.id.joinCancel:
                Toast.makeText(this,"joinCancel",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
