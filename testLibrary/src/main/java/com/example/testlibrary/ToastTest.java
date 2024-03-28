package com.example.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastTest {
    public static void longToast(Context context,String s)
    {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
