package com.bird_brown.drawtestapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;


public class DrawView extends View {

    //DrawViewクラスにViewクラスを継承したコンストラクタを定義
    //Viewをactivity_main.xmlに配置する場合にオーバーロードが必要(Palette-Projectに表示)
    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint(); //Paintクラスのオブジェクトを生成する
        paint.setAntiAlias(true); //アンチエイリアスを設定する
        paint.setStrokeWidth(4.0F); //線の太さを設定

        //***** 円の描画 *****/
        paint.setStyle(Paint.Style.FILL); //図形の内部を塗りつぶす
        paint.setColor(Color.RED); //色を赤に設定

        canvas.drawCircle(100.0F, 100.0F, 50.0F, paint); //円の描画

        //***** 四角形の描画 *****/
        paint.setStyle(Paint.Style.FILL); //図形の内部を塗りつぶす
        paint.setColor(Color.BLUE); //色を青に設定

        canvas.drawRect(200.0F, 50.F, 300.0F, 150.0F, paint); //四角形の描画

        //***** 線の描画 *****/
        paint.setStyle(Paint.Style.STROKE); //図形の輪郭線のみを描画する
        paint.setColor(Color.BLACK); //色を黒に設定

        Path path = new Path(); //Pathクラスのオブジェクトを生成する
        path.moveTo(50.0F, 300.0F); //直線の始点の設定
        path.lineTo(250.0F, 200.0F); //直線の終点の設定

        canvas.drawPath(path, paint); //Pathを使用した線の描画
    }

}
