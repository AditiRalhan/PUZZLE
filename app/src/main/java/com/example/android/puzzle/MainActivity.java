package com.example.android.puzzle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button B1 = (Button) findViewById(R.id.button1);
        B1.setOnClickListener(this);

        Button B2 = (Button) findViewById(R.id.button2);
        B2.setOnClickListener(this);

        Button B3 = (Button) findViewById(R.id.button3);
        B3.setOnClickListener(this);

        Button B4 = (Button) findViewById(R.id.button4);
        B4.setOnClickListener(this);

        Button B5 = (Button) findViewById(R.id.button5);
        B5.setOnClickListener(this);

        Button B6 = (Button) findViewById(R.id.button6);
        B6.setOnClickListener(this);

        Button B7 = (Button) findViewById(R.id.button7);
        B7.setOnClickListener(this);

        Button B8 = (Button) findViewById(R.id.button8);
        B8.setOnClickListener(this);

        Button B9 = (Button) findViewById(R.id.button9);
        B9.setOnClickListener(this);

        Button B10 = (Button) findViewById(R.id.button10);
        B10.setOnClickListener(this);
    }




    @Override
    public void onClick(View v)


    {

        Button B1 = (Button) findViewById(R.id.button1);
        String t1=B1.getText().toString();

        Button B2 = (Button) findViewById(R.id.button2);
        String t2=B2.getText().toString();

        Button B3 = (Button) findViewById(R.id.button3);
        String t3=B3.getText().toString();

        Button B4 = (Button) findViewById(R.id.button4);
        String t4=B4.getText().toString();

        Button B5 = (Button) findViewById(R.id.button5);
        String t5=B5.getText().toString();

        Button B6 = (Button) findViewById(R.id.button6);
        String t6=B6.getText().toString();

        Button B7 = (Button) findViewById(R.id.button7);
        String t7=B7.getText().toString();

        Button B8 = (Button) findViewById(R.id.button8);
        String t8=B8.getText().toString();

        Button B9 = (Button) findViewById(R.id.button9);
        String t9=B9.getText().toString();






        switch (v.getId())
        {


            case R.id.button1:
            {

                if(t4.equals(" "))
                {
                    B4.setText(t1);
                    B1.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t2.equals(" "))
                {
                    B2.setText(t1);
                    B1.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;



            case R.id.button2:
            {
                if(t1.equals(" "))
                {
                    B1.setText(t2);
                    B2.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t3.equals(" "))
                {
                    B3.setText(t2);
                    B2.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t5.equals(" "))
                {
                    B5.setText(t2);
                    B2.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;


            case R.id.button3:
            {
                if(t2.equals(" "))
                {
                    B2.setText(t3);
                    B3.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t6.equals(" "))
                {
                    B6.setText(t3);
                    B3.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;







            case R.id.button4:
            {
                if(t1.equals(" "))
                {
                    B1.setText(t4);
                    B4.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                if(t5.equals(" "))
                {
                    B5.setText(t4);
                    B4.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t7.equals(" "))
                {
                    B7.setText(t4);
                    B4.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;



            case R.id.button5:
            {
                if(t2.equals(" "))
                {
                    B2.setText(t5);
                    B5.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                if(t4.equals(" "))
                {
                    B4.setText(t5);
                    B5.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t6.equals(" "))
                {
                    B6.setText(t5);
                    B5.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t8.equals(" "))
                {
                    B8.setText(t5);
                    B5.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;




            case R.id.button6:
            {
                if(t3.equals(" "))
                {
                    B3.setText(t6);
                    B6.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                if(t5.equals(" "))
                {
                    B5.setText(t6);
                    B6.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                if(t9.equals(" "))
                {
                    B9.setText(t6);
                    B6.setText(" ");
                    if (t1.equals("1") && t2.equals("2") && t3.equals("3") && t4.equals("4") && t5.equals("5") && t6.equals("6") && t7.equals("7") && t8.equals("8") && t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(), "CONGRATULATIONS!", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            break;

            case R.id.button7:
            {
                if(t4.equals(" "))
                {
                    B4.setText(t7);
                    B7.setText(" ");
                    if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                if(t8.equals(" "))
                {
                    B8.setText(t7);
                    B7.setText(" ");
                    if (t1.equals("1") && t2.equals("2") && t3.equals("3") && t4.equals("4") && t5.equals("5") && t6.equals("6") && t7.equals("7") && t8.equals("8") && t9.equals(" "))
                    {
                        Toast.makeText(getApplicationContext(), "CONGRATULATIONS!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;


            case R.id.button8: {
                if (t5.equals(" "))
                  {
                    B5.setText(t8);
                    B8.setText(" ");
                      if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                      {
                          Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                      }
                  }
                else if (t7.equals(" "))
                  {
                    B7.setText(t8);
                    B8.setText(" ");
                      if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" "))
                      {
                          Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                      }
                  }
                else if (t9.equals(" "))
                  {
                    B9.setText(t8);
                    B8.setText(" ");


                    if (t1.equals("1") && t2.equals("2") && t3.equals("3") && t4.equals("4") && t5.equals("5") && t6.equals("6") && t7.equals("7") && t8.equals("8") && t9.equals(" "))
                    {
                    Toast.makeText(getApplicationContext(), "CONGRATULATIONS!", Toast.LENGTH_SHORT).show();
                    }

                  }
            }
            break;


            case R.id.button9:
            {
                if(t6.equals(" "))
                {
                    B6.setText(t9);
                    B9.setText(" ");
                }

                else
                if(t8.equals(" "))
                {
                    B8.setText(t9);
                    B9.setText(" ");
                }
            }
            break;


            case R.id.button10:
            {
                if(t1.equals("1")&&t2.equals("2")&&t3.equals("3")&&t4.equals("4")&&t5.equals("5")&&t6.equals("6")&&t7.equals("7")&&t8.equals("8")&&t9.equals(" ")) {
                    Toast.makeText(getApplicationContext(),"CONGRATULATIONS!",Toast.LENGTH_SHORT).show();
                }
                    else {
                    Toast.makeText(getApplicationContext(), "Try Again!", Toast.LENGTH_SHORT).show();
                    B4.setText(t9);
                    B9.setText(t4);
                    B1.setText(t5);
                    B5.setText(t1);
                    B3.setText(t7);
                    B7.setText(t3);
                }
            }
            break;

            case R.id.button11:
            {
                Toast.makeText(getApplicationContext(), "Play Again!", Toast.LENGTH_SHORT).show();
                B2.setText(t6);
                B6.setText(t2);
                B8.setText(t3);
                B3.setText(t8);
                B4.setText(t1);
                B1.setText(t4);

            }

            default:
            {
                break;
            }


        }

    }
}
