package com.example.qklahpita.draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.nfc.Tag;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import static android.content.ContentValues.TAG;

/**
 * Created by admin on 2/1/2018.
 */

public class DrawingView extends View {
    private static final String TAG = "DrawingView";
    private Canvas canvas;
    int images[] = {R.drawable.food_1, R.drawable.food_2, R.drawable.food_3, R.drawable.food_4, R.drawable.food_5};
    int currentimage;
    public static ImageView imgview;



    private Bitmap bitmap;

    private void setupUI() {

    }
    public DrawingView(Context context) {
        super(context);

        canvas = new Canvas(bitmap);

    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int w = MeasureSpec.getSize(widthMeasureSpec);
        int h = MeasureSpec.getSize(heightMeasureSpec);

        int size = Math.min(w, h);
        setMeasuredDimension(size, size/2);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);

    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
    }


}
