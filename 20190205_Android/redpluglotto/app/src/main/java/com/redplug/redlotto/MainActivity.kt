package com.redplug.redlotto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.redplug.redlotto.LottoNumberMaker.getShuffleLottoNumbers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // 랜덤으로 번호 생성 카드의 클릭 이벤트 리스너
        randomCard.setOnClickListener {

            // ResultActivity를 시작하는 Intent 생성
            val intent = Intent(this, ResultActivity::class.java)

            // intent 의 결과 데이터를 전달한다.
            // int의 리스트를 전달하므로 putIntegerArrayListExtra를 사용한다.
            intent.putIntegerArrayListExtra("result", ArrayList(LottoNumberMaker.getShuffleLottoNumbers()))


            // ResultActivity를 시작하는 Intent 를 만들고 startActivity로 실행
            startActivity(intent)
        }

        // 별자리로 번호 생성 카드의 클릭 이벤트 리스너
        constellationCard.setOnClickListener {
            // constellationActivity를 시작하는 Intent 를 만들고 startActivity로 실행
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        // 이름으로 번호 생성 카드의 클릭 이벤트 리스너
        nameCard.setOnClickListener {
            // NameActivity를 시작하는 Intent 를 만들고 startActivity로 실행
            startActivity(Intent(this, NameActivity::class.java))
        }


//        Toast.makeText(applicationContext,"MainActivity 입니다.",Toast.LENGTH_LONG).show()
    }
}
