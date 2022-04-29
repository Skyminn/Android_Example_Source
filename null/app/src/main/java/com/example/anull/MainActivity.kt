package com.example.anull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//널: 객체가 선언되었지만 초기화되지 않은 상태, 객체가 주소를 가지지 못한 상태
//널 포인트 예외: 널인 상태의 객체를 이용할 수 없다는 오류
//널 안정성: 널 포인트 예외가 발생하지 않도록 코드를 작성하는 것

fun main() {
    var data:String? = "Kkang"
    println("data = $data : ${data?.length ?: -1}")
    data = null
    println("data = $data : ${data?.length ?: -1}")
    println(some("Kkang"))
    println(some(null))
}

fun some(data: String?): Int {
    return data!!.length
}
