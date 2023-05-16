package com.example.word_jumble

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Identity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.word_jumble.R

class SecondActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_main)

        var word = intent.getStringExtra("EXTRA_WORD")
        if (word != null) {
            word = word.replace("\\s".toRegex(), "").uppercase()
        }



        var clue = intent.getStringExtra("EXTRA_CLUE")
        var list = word?.split("")?.toMutableList()
        var scoreint:Int = 0
        var highScore:Int = 0

        if (list != null) {
            for (i in 0 until list.count()) {
                if (list[i] === "") {
                    list.remove(list[i])
                }
            }

        }

        list?.removeAt(0)
        list?.removeAt(list.count() - 1)
        var lowerLimit: Int = 0


//        var numberRandom = Random.nextInt(0 until 16-upperLimit)
        var alphaArray = mutableListOf(
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z"
        ).shuffled()
        var megaArray = alphaArray.slice(0..15 - (list?.count() ?: 0)) as MutableList<String>

        var newArray = mutableListOf<String>()
        if (list != null) {
            newArray.addAll(list)
        }

        newArray.addAll(megaArray)
        var mega: String = ""
        var index = 0


        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn12 = findViewById<Button>(R.id.btn12)
        val btn13 = findViewById<Button>(R.id.btn13)
        val btn14 = findViewById<Button>(R.id.btn14)
        val btn15 = findViewById<Button>(R.id.btn15)
        val btn16 = findViewById<Button>(R.id.btn16)

        var iconbutton = findViewById<TextView>(R.id.megaicon)
        var bgblur = findViewById<TextView>(R.id.cover)
        var clueshow = findViewById<TextView>(R.id.showclue)
        var whatclue = findViewById<TextView>(R.id.actualclue)
        var buttonOkay = findViewById<TextView>(R.id.okayit)
        var toastblue = findViewById<TextView>(R.id.toastblue)

        var playagain = findViewById<TextView>(R.id.playagain)
        var homebutton = findViewById<TextView>(R.id.homebutton)
        var score = findViewById<TextView>(R.id.score)
        var gameovertag = findViewById<TextView>(R.id.gameovertag)
        var blackline2 = findViewById<TextView>(R.id.blackline2)
        var blackline = findViewById<TextView>(R.id.blackline)
        var crowncontainer = findViewById<TextView>(R.id.crowncontainer)
        var gameover = findViewById<TextView>(R.id.gameover)
        var check = findViewById<Button>(R.id.check)


        var ak = mutableListOf<Char>()

        var bool1:Boolean = true
        var bool2:Boolean = true
        var bool3:Boolean = true
        var bool4:Boolean = true
        var bool5:Boolean = true
        var bool6:Boolean = true
        var bool7:Boolean = true
        var bool8:Boolean = true
        var bool9:Boolean = true
        var bool10:Boolean =  true
        var bool11:Boolean =  true
        var bool12:Boolean =  true
        var bool13:Boolean =  true
        var bool14:Boolean =  true
        var bool15:Boolean =  true
        var bool16:Boolean =  true

        var showcase = findViewById<TextView>(R.id.display)
        fun reset() {
            bool1 = true
            bool2 = true
            bool3 = true
            bool4 = true
            bool5 = true
            bool6 = true
            bool7 = true
            bool8 = true
            bool9 = true
            bool10 = true
            bool11 = true
            bool12 = true
            bool13 = true
            bool14 = true
            bool15 = true
            bool16 = true

            newArray.shuffle()


            btn1.text = newArray[0]
            btn2.text = newArray[1]
            btn3.text = newArray[2]
            btn4.text = newArray[3]
            btn5.text = newArray[4]
            btn6.text = newArray[5]
            btn7.text = newArray[6]
            btn8.text = newArray[7]
            btn9.text = newArray[8]
            btn10.text = newArray[9]
            btn11.text = newArray[10]
            btn12.text = newArray[11]
            btn13.text = newArray[12]
            btn14.text = newArray[13]
            btn15.text = newArray[14]
            btn16.text = newArray[15]

            btn1.setBackgroundResource(R.drawable.buttondefault)
            btn1.setTextColor(Color.argb(255, 0, 0, 0))
            btn2.setBackgroundResource(R.drawable.buttondefault)
            btn2.setTextColor(Color.argb(255, 0, 0, 0))
            btn3.setBackgroundResource(R.drawable.buttondefault)
            btn3.setTextColor(Color.argb(255, 0, 0, 0))
            btn4.setBackgroundResource(R.drawable.buttondefault)
            btn4.setTextColor(Color.argb(255, 0, 0, 0))
            btn5.setBackgroundResource(R.drawable.buttondefault)
            btn5.setTextColor(Color.argb(255, 0, 0, 0))
            btn6.setBackgroundResource(R.drawable.buttondefault)
            btn6.setTextColor(Color.argb(255, 0, 0, 0))
            btn7.setBackgroundResource(R.drawable.buttondefault)
            btn7.setTextColor(Color.argb(255, 0, 0, 0))
            btn8.setBackgroundResource(R.drawable.buttondefault)
            btn8.setTextColor(Color.argb(255, 0, 0, 0))
            btn9.setBackgroundResource(R.drawable.buttondefault)
            btn9.setTextColor(Color.argb(255, 0, 0, 0))
            btn10.setBackgroundResource(R.drawable.buttondefault)
            btn10.setTextColor(Color.argb(255, 0, 0, 0))
            btn11.setBackgroundResource(R.drawable.buttondefault)
            btn11.setTextColor(Color.argb(255, 0, 0, 0))
            btn12.setBackgroundResource(R.drawable.buttondefault)
            btn12.setTextColor(Color.argb(255, 0, 0, 0))
            btn13.setBackgroundResource(R.drawable.buttondefault)
            btn13.setTextColor(Color.argb(255, 0, 0, 0))
            btn14.setBackgroundResource(R.drawable.buttondefault)
            btn14.setTextColor(Color.argb(255, 0, 0, 0))
            btn15.setBackgroundResource(R.drawable.buttondefault)
            btn15.setTextColor(Color.argb(255, 0, 0, 0))
            btn16.setBackgroundResource(R.drawable.buttondefault)
            btn16.setTextColor(Color.argb(255, 0, 0, 0))

            var akshay: String = ""
            if (word != null) {
                for (i in 0..word.length - 1) {
                    if (i == word.length - 1) {
                        akshay += "_"
                    } else {
                        akshay += "_ "
                    }

                }
            }


            ak = akshay.toMutableList()

            showcase.text = akshay
            mega = ""
            index = 0

        }
      reset()

var clickbool = true
        var countnumber = 0
        if(clickbool) {
            btn1.setOnClickListener {
                if (bool1 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn1.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega

                    btn1.setBackgroundResource(R.drawable.buttonpressed)
                    btn1.setTextColor(Color.argb(255, 255, 255, 255))
                    bool1 = false
                    if (word != null) {
                        if(countnumber == word.length){
                        clickbool = false
                    }
                }
            }}

            btn2.setOnClickListener {
                if (bool2 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn2.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn2.setBackgroundResource(R.drawable.buttonpressed)
                    btn2.setTextColor(Color.argb(255, 255, 255, 255))
                    bool2 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn3.setOnClickListener {
                if (bool3 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn3.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn3.setBackgroundResource(R.drawable.buttonpressed)
                    btn3.setTextColor(Color.argb(255, 255, 255, 255))
                    bool3 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn4.setOnClickListener {
                if (bool4 && clickbool ) {
                    countnumber++
                    ak[2 * index] = btn4.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn4.setBackgroundResource(R.drawable.buttonpressed)
                    btn4.setTextColor(Color.argb(255, 255, 255, 255))
                    bool4 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn5.setOnClickListener {
                if (bool5 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn5.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn5.setBackgroundResource(R.drawable.buttonpressed)
                    btn5.setTextColor(Color.argb(255, 255, 255, 255))
                    bool5 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn6.setOnClickListener {
                if (bool6 && clickbool)  {
                    countnumber++
                    ak[2 * index] = btn6.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn6.setBackgroundResource(R.drawable.buttonpressed)
                    btn6.setTextColor(Color.argb(255, 255, 255, 255))
                    bool6 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn7.setOnClickListener {
                if (bool7 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn7.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn7.setBackgroundResource(R.drawable.buttonpressed)
                    btn7.setTextColor(Color.argb(255, 255, 255, 255))
                    bool7 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn8.setOnClickListener {
                if (bool8 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn8.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn8.setBackgroundResource(R.drawable.buttonpressed)
                    btn8.setTextColor(Color.argb(255, 255, 255, 255))
                    bool8 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn9.setOnClickListener {
                if (bool9 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn9.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn9.setBackgroundResource(R.drawable.buttonpressed)
                    btn9.setTextColor(Color.argb(255, 255, 255, 255))
                    bool9 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn10.setOnClickListener {
                if (bool10 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn10.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn10.setBackgroundResource(R.drawable.buttonpressed)
                    btn10.setTextColor(Color.argb(255, 255, 255, 255))
                    bool10 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn11.setOnClickListener {
                if (bool11 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn11.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn11.setBackgroundResource(R.drawable.buttonpressed)
                    btn11.setTextColor(Color.argb(255, 255, 255, 255))
                    bool11 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn12.setOnClickListener {
                if (bool12 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn12.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn12.setBackgroundResource(R.drawable.buttonpressed)
                    btn12.setTextColor(Color.argb(255, 255, 255, 255))
                    bool12 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn13.setOnClickListener {
                if (bool13 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn13.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn13.setBackgroundResource(R.drawable.buttonpressed)
                    btn13.setTextColor(Color.argb(255, 255, 255, 255))
                    bool13 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn14.setOnClickListener {

                if (bool14 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn14.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn14.setBackgroundResource(R.drawable.buttonpressed)
                    btn14.setTextColor(Color.argb(255, 255, 255, 255))
                    bool14 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn15.setOnClickListener {

                if (bool15 && clickbool) {
                    countnumber++
                    ak[2 * index] = btn15.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn15.setBackgroundResource(R.drawable.buttonpressed)
                    btn15.setTextColor(Color.argb(255, 255, 255, 255))
                    bool15 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }

            btn16.setOnClickListener {

                if (bool16 && clickbool) {

                    countnumber++
                    ak[2 * index] = btn16.text[0]
                    index++
                    mega = ""
                    for (i in 0..ak.count() - 1) {
                        mega += ak[i]
                    }
                    showcase.text = mega
                    btn16.setBackgroundResource(R.drawable.buttonpressed)
                    btn16.setTextColor(Color.argb(255, 255, 255, 255))
                    bool16 = false
                    if (word != null) {
                        if(countnumber == word.length){
                            clickbool = false
                        }
                    }
                }
            }
        }
        var c = true
        var checkButton = findViewById<Button>(R.id.check)
var incrementer:Int = 0
        var heart1 = findViewById<ImageView>(R.id.heart1)
        var heart2 = findViewById<ImageView>(R.id.heart2)
        var heart3 = findViewById<ImageView>(R.id.heart3)
        checkButton.setOnClickListener {
            if (word != null) {
                if (index == word.length) {
                    clickbool = true
                    c = true
                    for (i in 0..word.length - 1) {
                        if (mega[2 * i] != word[i]) {
                            //wrong msg..life down by 1
                            c = false
                            incrementer++

                            if (incrementer == 1) {
                                heart1.setImageResource(R.drawable.heartgrey)

                                reset()
                            } else if (incrementer == 2) {
                                heart2.setImageResource(R.drawable.heartgrey)

                                reset()
                            } else if (incrementer == 3) {

                                heart3.setImageResource(R.drawable.heartgrey)
                                bgblur.visibility = View.VISIBLE
                                playagain.visibility = View.VISIBLE
                                homebutton.visibility = View.VISIBLE
                                score.text = "Your Score: 0"
                                score.visibility = View.VISIBLE
                                gameovertag.visibility = View.VISIBLE
                                blackline2.visibility = View.VISIBLE
                                blackline.visibility = View.VISIBLE
                                crowncontainer.visibility = View.VISIBLE
                                gameover.visibility = View.VISIBLE
                                c = true

                                playagain.setOnClickListener {
                                    bgblur.visibility = View.INVISIBLE
                                    playagain.visibility = View.INVISIBLE
                                    homebutton.visibility = View.INVISIBLE
                                    score.visibility = View.INVISIBLE
                                    gameovertag.visibility = View.INVISIBLE
                                    blackline2.visibility = View.INVISIBLE
                                    blackline.visibility = View.INVISIBLE
                                    crowncontainer.visibility = View.INVISIBLE
                                    gameover.visibility = View.INVISIBLE
                                    heart1.setImageResource(R.drawable.heart)
                                    heart2.setImageResource(R.drawable.heart)
                                    heart3.setImageResource(R.drawable.heart)
                                    incrementer = 0
                                    c = true
                                    reset()

                                }


                            }
                            break
                        }


                    }
                    if (c) {

                            bgblur.visibility = View.VISIBLE
                            playagain.visibility = View.VISIBLE
                            homebutton.visibility = View.VISIBLE
                            if (incrementer == 0) {
                                scoreint = 300
                                score.text = "Your Score: 300"
                            } else if (incrementer == 1) {
                                scoreint = 200
                                score.text = "Your Score: 200"
                            } else if (incrementer == 2) {
                                scoreint = 100
                                score.text = "Your Score: 100"
                            }
                            score.visibility = View.VISIBLE
                            gameovertag.visibility = View.VISIBLE
                            blackline2.visibility = View.VISIBLE
                            blackline.visibility = View.VISIBLE
                            crowncontainer.visibility = View.VISIBLE
                            gameover.visibility = View.VISIBLE




                        playagain.setOnClickListener {
                            bgblur.visibility = View.INVISIBLE
                            playagain.visibility = View.INVISIBLE
                            homebutton.visibility = View.INVISIBLE
                            score.visibility = View.INVISIBLE
                            gameovertag.visibility = View.INVISIBLE
                            blackline2.visibility = View.INVISIBLE
                            blackline.visibility = View.INVISIBLE
                            crowncontainer.visibility = View.INVISIBLE
                            gameover.visibility = View.INVISIBLE
                            heart1.setImageResource(R.drawable.heart)
                            heart2.setImageResource(R.drawable.heart)
                            heart3.setImageResource(R.drawable.heart)
                            incrementer = 0
                            reset()

                        }
                        if(scoreint>highScore){
                            highScore = scoreint
                        }
                    }

                }else {

                        incrementer++
                        if(incrementer == 1){
                            heart1.setImageResource(R.drawable.heartgrey)
                            c = true
                            reset()
                        }else if(incrementer ==2){
                            heart2.setImageResource(R.drawable.heartgrey)
                            c = true
                            reset()
                        }else if(incrementer ==3){

                            heart3.setImageResource(R.drawable.heartgrey)
                            Toast.makeText(this,"GAME OVER",Toast.LENGTH_SHORT).show()
                            heart3.setImageResource(R.drawable.heartgrey)
                            bgblur.visibility = View.VISIBLE
                            playagain.visibility = View.VISIBLE
                            homebutton.visibility = View.VISIBLE
                            score.text = "Your Score: 0"
                            score.visibility = View.VISIBLE
                            gameovertag.visibility = View.VISIBLE
                            blackline2.visibility = View.VISIBLE
                            blackline.visibility = View.VISIBLE
                            crowncontainer.visibility = View.VISIBLE
                            gameover.visibility = View.VISIBLE
                            c = true


                            playagain.setOnClickListener{
                                bgblur.visibility = View.INVISIBLE
                                playagain.visibility = View.INVISIBLE
                                homebutton.visibility = View.INVISIBLE
                                score.visibility = View.INVISIBLE
                                gameovertag.visibility = View.INVISIBLE
                                blackline2.visibility = View.INVISIBLE
                                blackline.visibility = View.INVISIBLE
                                crowncontainer.visibility = View.INVISIBLE
                                gameover.visibility = View.INVISIBLE
                                heart1.setImageResource(R.drawable.heart)
                                heart2.setImageResource(R.drawable.heart)
                                heart3.setImageResource(R.drawable.heart)
                                incrementer = 0
                                c = true
                                reset()

                            }



                        }
                }
            }


        }

        var resetButton = findViewById<Button>(R.id.reset)
        resetButton.setOnClickListener{
            clickbool = true
          reset()
        }




        iconbutton.setOnClickListener{
            bgblur.visibility = View.VISIBLE
            clueshow.visibility = View.VISIBLE
            whatclue.text = clue
            whatclue.visibility = View.VISIBLE
            buttonOkay.visibility = View.VISIBLE
            toastblue.visibility = View.VISIBLE

        }

        buttonOkay.setOnClickListener{
            bgblur.visibility = View.INVISIBLE
            clueshow.visibility = View.INVISIBLE
            whatclue.visibility = View.INVISIBLE
            buttonOkay.visibility = View.INVISIBLE
            toastblue.visibility = View.INVISIBLE
        }

        var homebtn = findViewById<TextView>(R.id.homebutton)
        if(scoreint>highScore){
            highScore = scoreint
        }
        homebtn.setOnClickListener{
            Intent(this,MainActivity::class.java).also {
it.putExtra("EXTRA_HIGHSCORE",highScore.toString())
                startActivity(it)
            }
        }






    }}





