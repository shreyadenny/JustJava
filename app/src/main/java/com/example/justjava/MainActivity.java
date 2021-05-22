package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
/**

 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity = 2;

    /**

     This method is called when the order button is clicked.
     */
    public void increment(View view)
    {
       quantity = quantity + 1;
       display(quantity);
    }
    public void decrement(View view)
    {

        quantity = quantity - 1;
        display(quantity);
    }
    public void submitOrder(View view) {


        String priceMessage = "Total: $" + (quantity * 5);
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);

    }
    /**

     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}