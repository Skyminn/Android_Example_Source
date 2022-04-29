package com.example.class2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//상속 및 오버라이딩
//상위 클래스에서 오버라이딩을 허용할 변수나 함수 선언 앞에 open 키워드를 추가
//하위 클래스에서 재정의 할 때는 override 키워드 추가
open class Super {
    open var someData = 10
    open fun someFun() {
        println("i am superFun : $someData")
    }
}
class Sub: Super(){
    override var someData = 20
    override fun someFun() {
        println("i am sub class function: $someData")
    }
}

//데이터 클래스:data 키워드로 선언
class NonDataClass(val name:String,val email:String,val age:Int) //일반클래스
data class DataClass(val name:String,val email:String,val age:Int)

//컴패니언 클래스:클래스 이름으로 멤버에 접근할 수 있음
class MyClass {
    companion object {
        var data = 10
        fun some() {
            println(data)
        }
    }
}

fun main() {
    val obj = Sub()
    obj.someFun()
    val non1 = NonDataClass("KKang", "a@a.com", 10)
    val non2 = NonDataClass("KKang", "a@a.com", 10)
    val data1 = DataClass("KKang", "a@a.com", 10)
    val data2 = DataClass("KKang", "a@a.com", 10)
    println("non data class equals : ${non1.equals(non2)}")
    println("data class equals : ${data1.equals(data2)}")
    MyClass.data = 20
    MyClass.some()
}




