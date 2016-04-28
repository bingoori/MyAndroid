package com.bingoori.myandroid.com.myandroid.global;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.bingoori.myandroid.R;
import com.bingoori.myandroid.com.myandroid.board.BoardActivity;
import com.bingoori.myandroid.com.myandroid.board.WriteActivity;
import com.bingoori.myandroid.com.myandroid.member.JoinActivity;
import com.bingoori.myandroid.com.myandroid.member.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);

        findViewById(R.id.joinBtn).setOnClickListener(this);
        findViewById(R.id.loginBtn).setOnClickListener(this);
        findViewById(R.id.boardBtn).setOnClickListener(this);
        findViewById(R.id.writeBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        ComponentName componentName;


        switch (v.getId()){
            case R.id.joinBtn :
                Toast.makeText(this,"joinBtn",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,JoinActivity.class));break;
            case R.id.loginBtn :
                Toast.makeText(this,"loginBtn",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,LoginActivity.class));break;

            case R.id.boardBtn :
                Toast.makeText(this,"boardBtn",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,BoardActivity.class));break;

            case R.id.writeBtn :
                Toast.makeText(this,"writeBtn",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,WriteActivity.class));break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
