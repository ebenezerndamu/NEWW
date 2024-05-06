package za.ac.iie.neww

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)
        val playTextView = findViewById<TextView>(R.id.playTextView)

        // Retrieve the extra string from the intent
        val feedMessage = intent.getStringExtra("feed_message")
        // Set the text in the feedTextView
        feedTextView.text = feedMessage

        // Set onClickListener for the feedButton
        feedButton.setOnClickListener {
            // Change the petImageView resource to pug_eating
            petImageView.setImageResource(R.drawable.pug_eating)
            // Update the text in feedTextView
            feedTextView.text = "Ouch, I am hungry, please feed me"
        }

        // Set onClickListener for the cleanButton
        cleanButton.setOnClickListener {
            // Change the petImageView resource to pug_bathing
            petImageView.setImageResource(R.drawable.pug_bathing)
            // Update the text in cleanTextView
            cleanTextView.text = "I am dirty, please clean me"
        }

        // Set onClickListener for the playButton
        playButton.setOnClickListener {
            // Change the petImageView resource to pug_playing
            petImageView.setImageResource(R.drawable.pug_playing)
            // Update the text in playTextView
            playTextView.text = "Please play with me"
        }
    }
}

