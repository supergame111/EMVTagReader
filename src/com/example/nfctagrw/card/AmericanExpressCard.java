package com.example.nfctagrw.card;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.example.nfctagrw.R;
import com.example.nfctagrw.card.base.Card;

public class AmericanExpressCard extends Card {

    public AmericanExpressCard(Card me) {
        super(me);
        // TODO Auto-generated constructor stub
    }
    
    public Bitmap getRepresentImg() {
        Log.i(TAG, "get Img");
        
        Context context = getCardHolderContext();
        return BitmapFactory.decodeResource(context.getResources(),
                R.drawable.americanexp);
    }

}
