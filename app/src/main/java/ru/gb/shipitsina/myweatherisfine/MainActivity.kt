package ru.gb.shipitsina.myweatherisfine

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(
                getApplicationContext(),
                "Hello, World!",
                Toast.LENGTH_SHORT
            ).show()
        }

        //Сформировать data class с двумя свойствами и вывести их на экран приложения.
        val testNote = Note("Заголовок", "Текст")

        val tvTitle: TextView = findViewById(R.id.textView3)
        tvTitle.text = testNote.title

        val tvNote: TextView = findViewById(R.id.textView2)
        tvNote.text = testNote.note

        //Создать Object. В Object вызвать copy и вывести значения скопированного класса на экран.
        val tvCopyTitle: TextView = findViewById(R.id.textView4)
        tvCopyTitle.text = NewTitle.newTitleCopy.title

        //Вывести значения из разных циклов в консоль, используя примеры из методических материалов.
        fun cycle1() {
            for (i in 1..10) {
                println(i)
            }
            var count: Int = 0
            while (count <= 10) {
                count += 1
                println(count)
            }
        }
    }
}