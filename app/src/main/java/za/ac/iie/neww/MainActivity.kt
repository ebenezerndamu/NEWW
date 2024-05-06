package za.ac.iie.neww

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Button to navigate to the second screen
        val startButton =findViewById<Button>(R.id.WelcomeButton)
        startButton.setOnClickListener {
            val intent=Intent(this , GameActivity ::class.java)
            // Pass the message "I am hungry" as an extra with the intent
            intent.putExtra("please feed me", "I am hungry")
            startActivity(intent)




        }
    }
}



