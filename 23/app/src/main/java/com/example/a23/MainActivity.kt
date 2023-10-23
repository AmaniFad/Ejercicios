package com.example.a23

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    private lateinit var buttons: Array<Array<Button>>
    //  matriz de botones

    private var player1Turn: Boolean = true

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttons = Array(3) { row ->
            Array(3) { column ->
                findViewById<Button>(
                    resources.getIdentifier(
                        "button$row$column",
                        "id",
                        packageName
                    )
                )
            }
        }


        var playerText = findViewById<TextView>(R.id.textView)
        playerText.text = "PLAYER: X"


        fun OnClickIntoBox(row: Int, column: Int) {
            val button = buttons[row][column]
            Log.d("EventosClick", "Se hizo clic en el botón en la fila $row y columna $column")
            if (button.text != "X" && button.text != "O") {
                Log.d("if!buttonClicked", "ha entrado en el if")
                if (player1Turn) {
                    Log.d("ifplayer1Turn", "ha entrado en el if")
                    button.text = "X"
                    button.setTextColor(Color.BLACK)
                    playerText.text = "PLAYER: O"
                } else {
                    Log.d("if!player1Turn", "ha entrado en el if")
                    button.text = "O"
                    button.setTextColor(Color.BLACK)
                    playerText.text = "PLAYER: X"
                }
                player1Turn = !player1Turn
                button.isEnabled = false
                if (checkForWin()) {
                    val toast = Toast.makeText(this, "Has ganado a el player" + playerText.text , Toast.LENGTH_LONG)
                    toast.show()

                }
            }
        }
        for (row in 0 until 3) {
            for (col in 0 until 3) {
                buttons[row][col].setOnClickListener {
                    OnClickIntoBox(row, col)
                }
            }
        }

    }
    fun checkForWin(): Boolean {
        for (row in 0 until 3) {
            if (buttons[row][0].text == buttons[row][1].text && buttons[row][1].text == buttons[row][2].text && buttons[row][0].text != "") {
                return true
            }
        }
        for (column in 0 until 3) {
            if (buttons[0][column].text == buttons[1][column].text && buttons[1][column].text == buttons[2][column].text && buttons[0][column].text != "") {
                return true
            }
        }
        if ((buttons[0][0].text == buttons[1][1].text && buttons[1][1].text == buttons[2][2] && buttons[0][0].text != "") ||
            (buttons[0][2].text == buttons[1][1].text && buttons[1][1].text == buttons[2][0].text && buttons[0][2].text != "")
        ) {
            return true
        }
        return false
    }
}