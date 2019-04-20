package com.smss.update.pressureblood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {
    EditText read1,read2,age;
    Button checkIn;
    Calendar sCalendar;
    String dayLongName;
    String allReads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        read1=(EditText)findViewById(R.id.read1);
        read2=(EditText)findViewById(R.id.read2);
        age=(EditText)findViewById(R.id.age);

        checkIn=(Button)findViewById(R.id.check);

        checkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(Main3Activity.this, "mmme", Toast.LENGTH_SHORT).show();

                String a1 = read1.getText().toString();
                String a2 = read2.getText().toString();
                String age1 = age.getText().toString();

                int a3 = Integer.parseInt(a1);
                int a4 = Integer.parseInt(a2);
                int ageInt = Integer.parseInt(age1);

                // Toast.makeText(Main3Activity.this, "a3=" + a3 + "a4=" + a4, Toast.LENGTH_SHORT).show();

                if (ageInt >= 12 && ageInt <= 49) {
                    if (a3 >= 115 && a3 <= 134 && a4 >= 73 && a4 <= 85) {


                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage(" ضغطك معتدل :حافظ دوما على ذلك المعدل لضغط")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.ass4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Ok", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Cancel", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();


                    }
                }
                if (ageInt >= 50) {
                    if (a3 >= 125 && a3 <= 137 && a4 >= 80 && a4 <= 89) {

                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك معتدل :حافظ دوما على ذلك المعدل لضغط")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.aa4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Ok", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Cancel", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();

                    }

                }


               else if (ageInt >= 12 && ageInt <= 49) {
                    if (a3 <= 115 && a4<= 73) {

                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك منخفض يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.aa4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Ok",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Cancel",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();


                    }
                }
                if (ageInt >= 50) {

                    if (a3 <= 125 && a4<= 80) {
                       /* new AlertDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك منخفض يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                    }
                                }).setNegativeButton("No", null).show();*/
                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك منخفض يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.aa4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Ok",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Cancel",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();


                    }
                }


              else   if (ageInt >= 12 && ageInt <= 49) {
                    if (a3  >= 134 && a4 >= 85) {
                     /*   new AlertDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك   عالي يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                    }
                                }).setNegativeButton("No", null).show();*/
                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك   عالي يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.aa4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Ok",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Cancel",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();

                    }
                }  if (ageInt >= 50) {

                    if (a3 >= 137 && a4 >= 89) {
                        /*new AlertDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك عالي يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص .")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                    }
                                }).setNegativeButton("No", null).show();*/
                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("ضغطك   عالي يرجى قراءه الإسعافات الأوليه في التطبيق او مراجعه الطبيب المختص.")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.aa4)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Ok",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this,"Cancel",Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();

                    }
                }
           /*   else{
                        Toast.makeText(Main3Activity.this, ""+a3+""+a4+""+ageInt, Toast.LENGTH_SHORT).show();

                        new FancyGifDialog.Builder(Main3Activity.this)
                                .setTitle("نتيجة الاختبار")
                                .setMessage("                        الضغط غير مسيطر عليه يجب مراجعة الطبيب لغرض تعديل الادوية و " +
                                        "مراجعة صفحة طريقك لحياة صحية في التطبيق للسيطرة على الضغط\n")
                                .setNegativeBtnText("Cancel")
                                .setPositiveBtnBackground("#0cba8b")
                                .setPositiveBtnText("Ok")
                                .setNegativeBtnBackground("#0cba8b")
                                .setGifResource(R.drawable.gif1)   //Pass your Gif here
                                .isCancellable(true)
                                .OnPositiveClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Ok", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .OnNegativeClicked(new FancyGifDialogListener() {
                                    @Override
                                    public void OnClick() {
                                        Toast.makeText(Main3Activity.this, "Cancel", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .build();

                    }*/
                }




          }
          );



}}
