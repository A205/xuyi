package com.jeminno.bmi;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button = null;
    private TextView show = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button=(Button)findViewById(R.id.BMIbutton);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener() {
            double bmi=0;
            public void onClick(View v) {

                double h=new Double(height.getText().toString());
                double w=new Double(weight.getText().toString());
                bmi=w/(h*h);

                double final_resault = exchangeResault(bmi);
                if(bmi<18.5){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"(⊙o⊙)哦！体重过轻，注意增加饮食！");
                }
                else if(bmi>=18.5||bmi<24){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"O(∩_∩)O~体重正常，继续保持！");
                }
                else if(bmi>=24||bmi<27){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"(～ o ～)~zZ！体重稍重，注意锻炼！");
                }
                else if(bmi>=27||bmi<30){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"~~o(>_<)o ~~轻度肥胖，多锻炼，注意饮食健康！");
                }
                else if(bmi>=30||bmi<35){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"~(@^_^@)~中度肥胖，注意饮食要节制，适当减肥！");
                }
                else if(bmi>35){
                    show.setText("您的身高体重指数是："+final_resault+"  "+"（*@ο@*） 哇～重度肥胖，必须减肥，不然易患多种肥胖引起的疾病！");
                }
            }
        });
    }

    public double exchangeResault(double resault){
        double first =resault*100;
        double second = (int) first;
        double second_first = first-second;

        if(second_first>0.5){
            second++;
        }

        double jirguo = (double)second/100;
        return jirguo;
    }
}
