package molina.raul.popcornfactory

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)


        val s1: RadioButton = findViewById(R.id.seat1)
        val s2: RadioButton = findViewById(R.id.seat2)
        val s3: RadioButton = findViewById(R.id.seat3)
        val s4: RadioButton = findViewById(R.id.seat4)
        val s5: RadioButton = findViewById(R.id.seat5)
        val s6: RadioButton = findViewById(R.id.seat6)
        val s7: RadioButton = findViewById(R.id.seat7)
        val s8: RadioButton = findViewById(R.id.seat8)
        val s9: RadioButton = findViewById(R.id.seat9)
        val s10: RadioButton = findViewById(R.id.seat10)
        val s11: RadioButton = findViewById(R.id.seat11)
        val s12: RadioButton = findViewById(R.id.seat12)
        val s13: RadioButton = findViewById(R.id.seat13)
        val s14: RadioButton = findViewById(R.id.seat14)
        val s15: RadioButton = findViewById(R.id.seat15)
        val s16: RadioButton = findViewById(R.id.seat16)
        val s17: RadioButton = findViewById(R.id.seat17)
        val s18: RadioButton = findViewById(R.id.seat18)
        val s19: RadioButton = findViewById(R.id.seat19)
        val s20: RadioButton = findViewById(R.id.seat20)
        /**
        val rg1: RadioGroup = findViewById(R.id.row1)
        val rg2: RadioGroup = findViewById(R.id.row2)
        val rg3: RadioGroup = findViewById(R.id.row3)
        val rg4: RadioGroup = findViewById(R.id.row4)
        */
        val title: TextView = findViewById(R.id.titleSeats)
        var posMovie = -1

        val bundle = intent.extras

        if (bundle != null) {
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("id")
        }

        val confirm: Button = findViewById(R.id.confirm)

        confirm.setOnClickListener {

            if(s1.isChecked){
                s1.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s2.isChecked){
                s1.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s3.isChecked){
                s3.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s4.isChecked){
                s4.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s5.isChecked){
                s5.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s6.isChecked){
                s6.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s7.isChecked){
                s7.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s8.isChecked){
                s8.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s9.isChecked){
                s9.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s10.isChecked){
                s10.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s11.isChecked){
                s11.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s12.isChecked){
                s12.setBackgroundColor(R.drawable.radio_disabled)
            }
            if(s13.isChecked){
                s13.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s14.isChecked){
                s14.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s15.isChecked){
                s15.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s16.isChecked){
                s16.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s17.isChecked){
                s17.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s18.isChecked){
                s18.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s19.isChecked){
                s19.setBackgroundColor(R.drawable.radio_disabled)

            }
            if(s20.isChecked){
                s20.setBackgroundColor(R.drawable.radio_disabled)

            }




            //logica para reservar
            //resumen de la compra, nombre del cliente y asiento
            Toast.makeText(this, "Enjoy the movie :D", Toast.LENGTH_LONG).show()
        }

        val row1: RadioGroup = findViewById(R.id.row1)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)

        row1.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId > -1) {
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)
            }

            row2.setOnCheckedChangeListener { group, checkedId ->

                if (checkedId > -1) {
                    row1.clearCheck()
                    row3.clearCheck()
                    row4.clearCheck()

                    row2.check(checkedId)
                }
            }
            row3.setOnCheckedChangeListener { group, checkedId ->

                if (checkedId > -1) {
                    row2.clearCheck()
                    row1.clearCheck()
                    row4.clearCheck()

                    row3.check(checkedId)
                }
            }
            row4.setOnCheckedChangeListener { group, checkedId ->

                if (checkedId > -1) {
                    row2.clearCheck()
                    row3.clearCheck()
                    row1.clearCheck()

                    row4.check(checkedId)
                }
            }
        }

    }
}