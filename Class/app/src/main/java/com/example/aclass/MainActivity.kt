package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class User {
    var name = "kkang"

    constructor(name: String) {
        this.name = name
    }
    fun someFun() {
        println("name : $name")
    }
    class SomeClass{}
}

//생성자의 매개변수를 다른 함수에서 사용하는 예
class USER (name: String, count: Int) {
    //클래스 멤버 변수 선언
    var name: String
    var count: Int
    init {
        //클래스 멤버변수에 생성자 매개변숫값 대입
        this.name = name
        this.count = count
    }
    fun someFun() {
        println("name: $name, count: $count")
    }
}

fun main(){
    val user = USER("kkang", 10) //객체 생성
    user.someFun() //name: kkang, count: 10
}
