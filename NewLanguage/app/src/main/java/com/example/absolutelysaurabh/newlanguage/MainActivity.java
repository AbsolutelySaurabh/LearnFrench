package com.example.absolutelysaurabh.newlanguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*******  NOTE  ********

        //Shorted LInes of Code
        //The lINES BELOW PREVENTED US FROM MAKING ANOTHER CLAQSS FOR MAKING TOASTS OR FOR ONCLICKLISTENER;
        //SE WE HAVE DONE ALL THA IS SINGLE MAINACTIVITY .JAVA ITSELF;
        TextView toasted = (TextView) findViewById(R.id.toast);

        toasted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Toasting...", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void NumbersClicked(View view){

        Intent numbers = new Intent(this,Numbers.class);
        startActivity(numbers);

    }
    public void PhrasesClicked(View view){

        Intent numbers = new Intent(this,Phrases.class);
        startActivity(numbers);

    }
    public void FamilyMembersClicked(View view){

        Intent numbers = new Intent(this,FamilyMembers.class);
        startActivity(numbers);

    }

    public void ColorsClicked(View view){

        Intent numbers = new Intent(this,Colors.class);
        startActivity(numbers);

    }
    public void GroceryClicked(View view){

        Intent numbers = new Intent(this,Grocery.class);
        startActivity(numbers);

    }
    public void AgricultureClicked(View view){

        Intent numbers = new Intent(this,Agriculture.class);
        startActivity(numbers);

    }
}
