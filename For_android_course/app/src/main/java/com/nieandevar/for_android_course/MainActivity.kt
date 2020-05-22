package com.nieandevar.for_android_course
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun CheckPass(view:View){
        val randomIntent = Intent(this, Main2Activity ::class.java)
        var Crutch : Int = FoundID(UserNameFront.text.toString(),PassFront.text.toString())
        if (Crutch == -1)
        {
            val MToast = Toast.makeText(this, "Password or username is incorrect", Toast.LENGTH_SHORT)
            MToast.show()
            UserNameFront.text = null;
            PassFront.text = null;
        } else
        {
            val MToastS = Toast.makeText(this, Crutch.toString() , Toast.LENGTH_SHORT)
            MToastS.show()
            val ListR = ArrayList<String>()
            ListR.add( "a@mail.ru A12345e 1 I Q")
            ListR.add( "b@mail.ru B12345e 2 T K")
            ListR.add( "c@mail.ru E12345e 3 D S")
            ListR.add( "v@mail.ru Y12345e 4 R P")
            ListR.add( "z@mail.ru H12345e 5 N M")

            val ListM =  ListR[ Crutch ].split(" ") as ArrayList<String> 
           
            //точка Вылета
            randomIntent.putExtra("Name1",ListR[3] )
            randomIntent.putExtra("Name2", ListR[4])
            randomIntent.putExtra("email", ListR[0])

            startActivity(randomIntent)
        }
    }
    fun FoundID(Name: String, Pass: String):Int {
        val ListR = ArrayList<String>()
        ListR.add( "a@mail.ru A12345e 1 I Q")
        ListR.add( "b@mail.ru B12345e 2 T K")
        ListR.add( "c@mail.ru E12345e 3 D S")
        ListR.add( "v@mail.ru Y12345e 4 R P")
        ListR.add( "z@mail.ru H12345e 5 N M")

        var Result: Int = -1;

        /*val writer = File("Data.txt").bufferedWriter()
        writer.write("Custumer 123456 1");
        writer.close()
        //Я не знаю почему но у меня приложение с этим куском вылетает
        //точка вылета
        for (line in File("Data.txt").readLines()) {
             List<String> = line.toString().split(" ")*/
        for (line in ListR) {
            var ListT: List<String> = line.split(" ")
            if ((ListT[0] == Name) && (ListT[1] == Pass)) {
                Result = ListT[2].toInt()
            }
        }



                return Result
        }

}
