package com.example.control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    //if~else 문 사용예
    var data = 10
    if(data > 0) {
        println("data > 0")
    } else {
        println("data <= 0")
    }

    //조건을 여러개 나열한 예
    if(data > 10) {
        println("data > 10")
    } else if(data > 0 && data <= 10) {
        println("data > 0 && data <= 10")
    } else {
        println("data <= 0")
    }

    //표현식으로 사용 예 *else 생략 불가능, 마지막 줄에 해당하는 값만 반환함
    val result = if(data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)

    //조건문 when
    when(data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }

    //다양한 유형의 조건 제시
    var data1: Any = 10
    when(data1) {
        is String -> println("data is String") //is는 타입을 확인하는 연산자
        20, 30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10") //in은 범위 지정 연산자
        else -> println("data is not valid")
    }

    //반복문 for과 while
    var sum: Int = 0
    for(i in 1..10) {
        sum += i
    }
    println(sum)

    //반복 조건에 컬렉션 타입 활용
    var data2 = arrayOf<Int>(10,20,30)
    for (i in data2.indices) { //indices는 배열의 인덱스를 의미
        print(data2[i])
        if(i != data2.size -1) print(",")
    }
    println()

    //인덱스와 데이터를 가져오는 withIndex() 함수
    var data3 = arrayOf<Int>(10,20,30)
    for ((index, value) in data3.withIndex()) {
        print(value)
        if (index !== data3.size - 1) print(",")
    }

}