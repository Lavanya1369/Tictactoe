package com.ench.lavanya1369.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class First extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
b1=(Button)findViewById(R.id.bt1);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(First.this);
        View mView = getLayoutInflater().inflate(R.layout.newtext, null);
        final EditText mEmail = (EditText) mView.findViewById(R.id.e1);
        final EditText mPassword = (EditText) mView.findViewById(R.id.e2);
        Button mLogin = (Button) mView.findViewById(R.id.play);


        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mEmail.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()){
                    Intent intent = new Intent ( First.this, MainActivity.class );
                    intent.putExtra ( "TextBox", mEmail.getText().toString() );
                    intent.putExtra ( "TextBox1", mPassword.getText().toString() );
                    startActivity(intent);

                    dialog.dismiss();
                }else{
                    Toast.makeText(First.this,
                            "please enter players name",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
       /* mBuilder.setAdapter(mView);
        AlertDialog dialog=mBuilder.create();
        dialog.show();*/
//
    }
});




    }


}
