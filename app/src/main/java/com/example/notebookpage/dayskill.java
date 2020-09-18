package com.example.notebookpage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

import java.util.jar.Attributes;


public class dayskill extends androidx.appcompat.widget.AppCompatEditText {
    private Paint paint;

    public dayskill(Context context) {
        super(context);
        initPaint();
    }

    public dayskill(Context context, AttributeSet set){
        super(context, set);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
     //  canvas.drawCircle(20,20,33,paint); // to check circle image
        paint.setColor(Color.GREEN);
        for (int i=1;i<2000;i+=20)

            canvas.drawLine(0,10+i,1000,10+i,paint);
        paint.setColor(Color.RED);
        canvas.drawLine(100,10,100,2000,paint);
    }
    private  void initPaint()
    {
        paint=new Paint();
        paint.setColor(Color.BLUE);
    }
}
