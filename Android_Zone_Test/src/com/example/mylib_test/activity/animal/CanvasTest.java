package com.example.mylib_test.activity.animal;

import com.example.mylib_test.R;
import com.example.mylib_test.activity.animal.viewa.BaseDraw;
import com.example.mylib_test.activity.animal.viewa.Canvas1;
import com.example.mylib_test.activity.animal.viewa.MatrixView;
import com.example.mylib_test.activity.animal.viewa.SimpleDraw;
import com.example.mylib_test.activity.animal.viewa.SinView;

import and.utils.image.BitmapUtils;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class CanvasTest extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String type = getIntent().getStringExtra("type");
		if("layer".equals(type)){
			setContentView(new Canvas1(this));
		}
		if("porterDuff".equals(type)){
			setContentView(R.layout.a_porterduff_xfermode);
		}
		
		if("shader".equals(type)){
			setContentView(R.layout.a_shader);
		}
		
		if("surfaceView".equals(type)){
			setContentView(new SinView(this));
		}
		if("bt_surface".equals(type)){
			setContentView(new SimpleDraw(this));
		}
		if("bt_MatrixPre".equals(type)){
				setContentView(new MatrixView(this));
			}
		if("bt_bitmap".equals(type)){
			setContentView(R.layout.a_btimap_copy);
		}
		if("bt_draw".equals(type)){
			setContentView(new BaseDraw(this));
		}
		if("bt_bitmaptoRound".equals(type)){
			ImageView iv = new ImageView(this);
			iv.setImageBitmap(BitmapUtils.toRoundBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.abcd), true));
			iv.setBackgroundColor(Color.YELLOW);
			setContentView(iv);
		}
		if("bt_bitmaptoRorate".equals(type)){
			ImageView iv = new ImageView(this);
			iv.setImageBitmap(BitmapUtils.rotateBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.abcd), 45,true));
			iv.setBackgroundColor(Color.YELLOW);
			setContentView(iv);
		}
		if("bt_bitmaptoScale".equals(type)){
			ImageView iv = new ImageView(this);
			iv.setImageBitmap(BitmapUtils.scaleBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.abcd),0.5F,0.5F,true));
			iv.setScaleType(ScaleType.CENTER);
			iv.setBackgroundColor(Color.YELLOW);
			setContentView(iv);
		}
		
	
	}
}
