package com.example.anonymousfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//람다 함수 선언 형식: {매개변수 -> 함수본문} , 함수 본문의 마지막 줄이 return 값
//타입 별칭 - typealias
typealias MyInt = Int

//고차함수: 함수를 매개변수로 전달받거나 반환하는 함수
fun hofFun(arg: (Int) -> Boolean): () -> String{
    val result = if(arg(10)){
        "valid"
    }else{
        "invalid"
    }
    return {"hofFun result: $result"}
}
fun main() {
    val some = {no1: Int, no2: Int -> println("in lambda function")
    no1*no2
    }
    println("result: ${some(10, 20)}")

    val data1:MyInt = 10
    val data2:MyInt = 20

    val result = hofFun({no -> no > 0})
    println(result())
}
