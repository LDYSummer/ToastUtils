package com.example.toastutils;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastUtils{

    private static ToastUtils mUtils;
    private static Context mContext;

    private static Toast mToast;

    private static ImageView imageView;
    private static TextView textView;

    public static final int TYPE_SHORT = 0;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_SUCCESS = 2;
    public static final int TYPE_FAILURE = 3;
    public static final int TYPE_ERROR = 4;

    public static ToastUtils init(Context context) {

        if (mUtils == null){
            mUtils = new ToastUtils();
        }
        mContext = context;

        initView();
        return mUtils;
    }

    private static void initView(){

        mToast = new Toast(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.toast_layout,null);
        mToast.setView(view);

        imageView = view.findViewById(R.id.toast_img);
        textView = view.findViewById(R.id.toast_msg);

    }

    public void show(String msg, int type){

        textView.setText(msg);

        switch (type){

            case TYPE_SHORT:

                mToast.setDuration(Toast.LENGTH_SHORT);

                break;

            case TYPE_LONG:

                mToast.setDuration(Toast.LENGTH_LONG);

                break;

            case TYPE_SUCCESS:

                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.utils_toast_pic_success);

                mToast.setGravity(Gravity.CENTER,0,0);
                mToast.setDuration(Toast.LENGTH_SHORT);

                break;

            case TYPE_FAILURE:

                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.utils_toast_pic_failure);

                mToast.setGravity(Gravity.CENTER,0,0);
                mToast.setDuration(Toast.LENGTH_SHORT);

                break;

            case TYPE_ERROR:

                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.utils_toast_pic_error);

                mToast.setGravity(Gravity.CENTER,0,0);
                mToast.setDuration(Toast.LENGTH_SHORT);

                break;

        }

        mToast.show();

    }

}
