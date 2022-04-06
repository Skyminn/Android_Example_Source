package com.example.variable_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    //변수 선언 var과 val의 차이: var은 재할당 가능, val은 재할당 불가능
    val data1 = 10
    var data2 = 20

    println(data1) //10

    //변수명 뒤에는 콜론(:)을 추가해 타입을 명시할 수 있음
    val data3: Int = 10
    println(data3) //10

    //초기값 할당 - 최상위에 선언한 변수나 클래스의 멤버 변수는 선언과 동시에 초기값 할당이 필수
    //초기화 미루기 - lateinit 또는 lazy 사용
    lateinit var data4: String
    val data5: Int by lazy {
        println("in lazy......")
        10
    }
    println("in main......")
    println(data5 + 10)
    println(data5 + 10)
//    in main......
//    in lazy......
//    20
//    20 (중괄호로 묶인 부분이 한번 실행되면 그 결과값이 변수의 초깃값으로 할당됨)

    //배열 선언 예시
    val data6 : Array<Int> = Array(3, { 0 })
    data6[0] = 10
    data6[1] = 20
    data6.set(2, 30) //배열에서 2번째 데이터를 30으로 설정
    println(data6.size) //3

    //배열 선언과 동시에 값 할당
    val data7 = arrayOf<Int>(10,20,30) //크기가 3인 Int 배열을 선언하고 10,20,30으로 할당

    //리스트 사용
    var list = listOf<Int>(10,20,30)
    println(
        """
            list size: ${list.size}
            list data: ${list[0]},${list[1]},${list[2]}
        """.trimIndent()
    )

    //가변리스트 사용
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
            list size: ${mutableList.size}
            list daata: ${mutableList[0]}, ${mutableList[1]}, ${mutableList[2]}, ${mutableList[3]}
        """.trimIndent()
    )

    //집합 사용
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size: ${map.size}
            map data: ${map.get("one")}, ${map.get("two")}
        """.trimIndent()
    )


}