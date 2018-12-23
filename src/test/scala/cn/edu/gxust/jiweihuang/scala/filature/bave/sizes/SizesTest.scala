package cn.edu.gxust.jiweihuang.scala.filature.bave.sizes

import cn.edu.gxust.jiweihuang.scala.test.UnitSpec

class SizesTest extends UnitSpec {
  "new Sizes(null,data:List[Double])" should "throw new IllegalArgumentException when {sizes.length < 2}" in {
    assertThrows[IllegalArgumentException](new Sizes(List(), null))
    assertThrows[IllegalArgumentException](new Sizes(0 :: Nil, null))
    //assertThrows[IllegalArgumentException](new Sizes(0 :: 1.0 :: Nil, null))
  }

  "***Average" should "be rightly print" in {
    println(s"TEST10010Average = $TEST10010Average")
    println(s"TEST10030Average = $TEST10030Average")
    println(s"ZJJX10050Average = $ZJJX10050Average")
    println(s"GXHX10050Average = $GXHX10050Average")
    println(s"GXLC50210Average = $GXLC50210Average")
    println(s"GXRA50200Average = $GXRA50200Average")
  }

  "The initial of Sizes" should "be right value" in {
    println(s"TEST10010Average.initial = ${TEST10010Average.initial}")
    println(s"TEST10030Average.initial = ${TEST10030Average.initial}")
    println(s"ZJJX10050Average.initial = ${ZJJX10050Average.initial}")
    println(s"GXHX10050Average.initial = ${GXHX10050Average.initial}")
    println(s"GXLC50210Average.initial = ${GXLC50210Average.initial}")
    println(s"GXRA50200Average.initial = ${GXRA50200Average.initial}")
  }
  "The Terminal of Sizes" should "be right value" in {
    println(s"TEST10010Average.terminal = ${TEST10010Average.terminal}")
    println(s"TEST10030Average.terminal = ${TEST10030Average.terminal}")
    println(s"ZJJX10050Average.terminal = ${ZJJX10050Average.terminal}")
    println(s"GXHX10050Average.terminal = ${GXHX10050Average.terminal}")
    println(s"GXLC50210Average.terminal = ${GXLC50210Average.terminal}")
    println(s"GXRA50200Average.terminal = ${GXRA50200Average.terminal}")
  }

  "The max of Sizes" should "be right value" in {
    println(s"TEST10010Average.max = ${TEST10010Average.max}")
    println(s"TEST10030Average.max = ${TEST10030Average.max}")
    println(s"ZJJX10050Average.max = ${ZJJX10050Average.max}")
    println(s"GXHX10050Average.max = ${GXHX10050Average.max}")
    println(s"GXLC50210Average.max = ${GXLC50210Average.max}")
    println(s"GXRA50200Average.max = ${GXRA50200Average.max}")
  }

  "The min of Sizes" should "be right value" in {
    println(s"TEST10010Average.min = ${TEST10010Average.min}")
    println(s"TEST10030Average.min = ${TEST10030Average.min}")
    println(s"ZJJX10050Average.min = ${ZJJX10050Average.min}")
    println(s"GXHX10050Average.min = ${GXHX10050Average.min}")
    println(s"GXLC50210Average.min = ${GXLC50210Average.min}")
    println(s"GXRA50200Average.min = ${GXRA50200Average.min}")
  }

  "The max index of Sizes" should "be right value" in {
    println(s"TEST10010Average.maxIndex = ${TEST10010Average.maxIndex}")
    println(s"TEST10030Average.maxIndex = ${TEST10030Average.maxIndex}")
    println(s"ZJJX10050Average.maxIndex = ${ZJJX10050Average.maxIndex}")
    println(s"GXHX10050Average.maxIndex = ${GXHX10050Average.maxIndex}")
    println(s"GXLC50210Average.maxIndex = ${GXLC50210Average.maxIndex}")
    println(s"GXRA50200Average.maxIndex = ${GXRA50200Average.maxIndex}")
  }

  "The min index of Sizes" should "be right value" in {
    println(s"TEST10010Average.minIndex = ${TEST10010Average.minIndex}")
    println(s"TEST10030Average.minIndex = ${TEST10030Average.minIndex}")
    println(s"ZJJX10050Average.minIndex = ${ZJJX10050Average.minIndex}")
    println(s"GXHX10050Average.minIndex = ${GXHX10050Average.minIndex}")
    println(s"GXLC50210Average.minIndex = ${GXLC50210Average.minIndex}")
    println(s"GXRA50200Average.minIndex = ${GXRA50200Average.minIndex}")
  }
}
