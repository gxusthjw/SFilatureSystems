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
    println(s"TEST10010Average = $TEST10010Average")
    println(s"TEST10030Average = $TEST10030Average")
    println(s"ZJJX10050Average = $ZJJX10050Average")
    println(s"GXHX10050Average = $GXHX10050Average")
    println(s"GXLC50210Average = $GXLC50210Average")
    println(s"GXRA50200Average = $GXRA50200Average")
    println(s"TEST10010Average.max = ${TEST10010Average.max}")
    println(s"TEST10030Average.max = ${TEST10030Average.max}")
    println(s"ZJJX10050Average.max = ${ZJJX10050Average.max}")
    println(s"GXHX10050Average.max = ${GXHX10050Average.max}")
    println(s"GXLC50210Average.max = ${GXLC50210Average.max}")
    println(s"GXRA50200Average.max = ${GXRA50200Average.max}")

    assertResult(3.25)(TEST10010Average.max)
    assertResult(2.9)(TEST10030Average.max)
    assertResult(3.53)(ZJJX10050Average.max)
    assertResult(3.84)(GXHX10050Average.max)
    assertResult(3.33)(GXLC50210Average.max)
    assertResult(3.05)(GXRA50200Average.max)
  }

  "The min of Sizes" should "be right value" in {
    println(s"TEST10010Average = $TEST10010Average")
    println(s"TEST10030Average = $TEST10030Average")
    println(s"ZJJX10050Average = $ZJJX10050Average")
    println(s"GXHX10050Average = $GXHX10050Average")
    println(s"GXLC50210Average = $GXLC50210Average")
    println(s"GXRA50200Average = $GXRA50200Average")
    println(s"TEST10010Average.min = ${TEST10010Average.min}")
    println(s"TEST10030Average.min = ${TEST10030Average.min}")
    println(s"ZJJX10050Average.min = ${ZJJX10050Average.min}")
    println(s"GXHX10050Average.min = ${GXHX10050Average.min}")
    println(s"GXLC50210Average.min = ${GXLC50210Average.min}")
    println(s"GXRA50200Average.min = ${GXRA50200Average.min}")

    assertResult(1.71)(TEST10010Average.min)
    assertResult(1.59)(TEST10030Average.min)
    assertResult(1.48)(ZJJX10050Average.min)
    assertResult(1.07)(GXHX10050Average.min)
    assertResult(1.17)(GXLC50210Average.min)
    assertResult(0.85)(GXRA50200Average.min)
  }

  "The max index of Sizes" should "be right value" in {
    println(s"TEST10010Average = $TEST10010Average")
    println(s"TEST10030Average = $TEST10030Average")
    println(s"ZJJX10050Average = $ZJJX10050Average")
    println(s"GXHX10050Average = $GXHX10050Average")
    println(s"GXLC50210Average = $GXLC50210Average")
    println(s"GXRA50200Average = $GXRA50200Average")
    println(s"TEST10010Average.maxIndex = ${TEST10010Average.maxIndex}")
    println(s"TEST10030Average.maxIndex = ${TEST10030Average.maxIndex}")
    println(s"ZJJX10050Average.maxIndex = ${ZJJX10050Average.maxIndex}")
    println(s"GXHX10050Average.maxIndex = ${GXHX10050Average.maxIndex}")
    println(s"GXLC50210Average.maxIndex = ${GXLC50210Average.maxIndex}")
    println(s"GXRA50200Average.maxIndex = ${GXRA50200Average.maxIndex}")

    assertResult(3)(TEST10010Average.maxIndex)
    assertResult(2)(TEST10030Average.maxIndex)
    assertResult(0)(ZJJX10050Average.maxIndex)
    assertResult(1)(GXHX10050Average.maxIndex)
    assertResult(2)(GXLC50210Average.maxIndex)
    assertResult(2)(GXRA50200Average.maxIndex)

  }

  "The min index of Sizes" should "be right value" in {
    println(s"TEST10010Average = $TEST10010Average")
    println(s"TEST10030Average = $TEST10030Average")
    println(s"ZJJX10050Average = $ZJJX10050Average")
    println(s"GXHX10050Average = $GXHX10050Average")
    println(s"GXLC50210Average = $GXLC50210Average")
    println(s"GXRA50200Average = $GXRA50200Average")
    println(s"TEST10010Average.minIndex = ${TEST10010Average.minIndex}")
    println(s"TEST10030Average.minIndex = ${TEST10030Average.minIndex}")
    println(s"ZJJX10050Average.minIndex = ${ZJJX10050Average.minIndex}")
    println(s"GXHX10050Average.minIndex = ${GXHX10050Average.minIndex}")
    println(s"GXLC50210Average.minIndex = ${GXLC50210Average.minIndex}")
    println(s"GXRA50200Average.minIndex = ${GXRA50200Average.minIndex}")

    assertResult(11)(TEST10010Average.minIndex)
    assertResult(10)(TEST10030Average.minIndex)
    assertResult(11)(ZJJX10050Average.minIndex)
    assertResult(10)(GXHX10050Average.minIndex)
    assertResult(19)(GXLC50210Average.minIndex)
    assertResult(18)(GXRA50200Average.minIndex)
  }

  "The length of Sizes" should "be right value" in {
    println(s"TEST10010Average.length = ${TEST10010Average.length}")
    println(s"TEST10030Average.length = ${TEST10030Average.length}")
    println(s"ZJJX10050Average.length = ${ZJJX10050Average.length}")
    println(s"GXHX10050Average.length = ${GXHX10050Average.length}")
    println(s"GXLC50210Average.length = ${GXLC50210Average.length}")
    println(s"GXRA50200Average.length = ${GXRA50200Average.length}")
  }

  "The sum of Sizes" should "be right value" in {
    println(s"TEST10010Average.sum = ${TEST10010Average.sum}")
    println(s"TEST10030Average.sum = ${TEST10030Average.sum}")
    println(s"ZJJX10050Average.sum = ${ZJJX10050Average.sum}")
    println(s"GXHX10050Average.sum = ${GXHX10050Average.sum}")
    println(s"GXLC50210Average.sum = ${GXLC50210Average.sum}")
    println(s"GXRA50200Average.sum = ${GXRA50200Average.sum}")
  }

  "The average of Sizes" should "be right value" in {
    println(s"TEST10010Average.average = ${TEST10010Average.average}")
    println(s"TEST10030Average.average = ${TEST10030Average.average}")
    println(s"ZJJX10050Average.average = ${ZJJX10050Average.average}")
    println(s"GXHX10050Average.average = ${GXHX10050Average.average}")
    println(s"GXLC50210Average.average = ${GXLC50210Average.average}")
    println(s"GXRA50200Average.average = ${GXRA50200Average.average}")
  }

  "The vari of Sizes" should "be right value" in {
    println(s"TEST10010Average.vari = ${TEST10010Average.vari}")
    println(s"TEST10030Average.vari= ${TEST10030Average.vari}")
    println(s"ZJJX10050Average.vari = ${ZJJX10050Average.vari}")
    println(s"GXHX10050Average.vari = ${GXHX10050Average.vari}")
    println(s"GXLC50210Average.vari = ${GXLC50210Average.vari}")
    println(s"GXRA50200Average.vari = ${GXRA50200Average.vari}")
  }
  "The vari2 of Sizes" should "be right value" in {
    println(s"TEST10010Average.vari2 = ${TEST10010Average.vari2}")
    println(s"TEST10030Average.vari2 = ${TEST10030Average.vari2}")
    println(s"ZJJX10050Average.vari2 = ${ZJJX10050Average.vari2}")
    println(s"GXHX10050Average.vari2 = ${GXHX10050Average.vari2}")
    println(s"GXLC50210Average.vari2 = ${GXLC50210Average.vari2}")
    println(s"GXRA50200Average.vari2 = ${GXRA50200Average.vari2}")

    assertResult(TEST10010Average.vari - TEST10010Average.vari2 < 1e-15)(true)
    assertResult(TEST10030Average.vari - TEST10030Average.vari2 < 1e-15)(true)
    assertResult(ZJJX10050Average.vari - ZJJX10050Average.vari2 < 1e-14)(true)
    assertResult(GXHX10050Average.vari - GXHX10050Average.vari2 < 1e-15)(true)
    assertResult(GXLC50210Average.vari - GXLC50210Average.vari2 < 1e-15)(true)
    assertResult(GXRA50200Average.vari - GXRA50200Average.vari2 < 1e-15)(true)

  }
  "The varis of Sizes" should "be right value" in {
    println(s"TEST10010Average.varis = ${TEST10010Average.varis}")
    println(s"TEST10030Average.varis = ${TEST10030Average.varis}")
    println(s"ZJJX10050Average.varis = ${ZJJX10050Average.varis}")
    println(s"GXHX10050Average.varis = ${GXHX10050Average.varis}")
    println(s"GXLC50210Average.varis = ${GXLC50210Average.varis}")
    println(s"GXRA50200Average.varis = ${GXRA50200Average.varis}")
  }

  "The varip of Sizes" should "be right value" in {
    println(s"TEST10010Average.varip = ${TEST10010Average.varip}")
    println(s"TEST10030Average.varip = ${TEST10030Average.varip}")
    println(s"ZJJX10050Average.varip = ${ZJJX10050Average.varip}")
    println(s"GXHX10050Average.varip = ${GXHX10050Average.varip}")
    println(s"GXLC50210Average.varip = ${GXLC50210Average.varip}")
    println(s"GXRA50200Average.varip = ${GXRA50200Average.varip}")
  }

  "The std of Sizes" should "be right value" in {
    println(s"TEST10010Average.std = ${TEST10010Average.std}")
    println(s"TEST10030Average.std= ${TEST10030Average.std}")
    println(s"ZJJX10050Average.std = ${ZJJX10050Average.std}")
    println(s"GXHX10050Average.std = ${GXHX10050Average.std}")
    println(s"GXLC50210Average.std = ${GXLC50210Average.std}")
    println(s"GXRA50200Average.std = ${GXRA50200Average.std}")
  }

  "The stds of Sizes" should "be right value" in {
    println(s"TEST10010Average.stds = ${TEST10010Average.stds}")
    println(s"TEST10030Average.stds = ${TEST10030Average.stds}")
    println(s"ZJJX10050Average.stds = ${ZJJX10050Average.stds}")
    println(s"GXHX10050Average.stds = ${GXHX10050Average.stds}")
    println(s"GXLC50210Average.stds = ${GXLC50210Average.stds}")
    println(s"GXRA50200Average.stds = ${GXRA50200Average.stds}")
  }

  "The stdp of Sizes" should "be right value" in {
    println(s"TEST10010Average.stdp = ${TEST10010Average.stdp}")
    println(s"TEST10030Average.stdp = ${TEST10030Average.stdp}")
    println(s"ZJJX10050Average.stdp = ${ZJJX10050Average.stdp}")
    println(s"GXHX10050Average.stdp = ${GXHX10050Average.stdp}")
    println(s"GXLC50210Average.stdp = ${GXLC50210Average.stdp}")
    println(s"GXRA50200Average.stdp = ${GXRA50200Average.stdp}")
  }

  "The sumsq of Sizes" should "be right value" in {
    println(s"TEST10010Average.sumsq = ${TEST10010Average.sumsq}")
    println(s"TEST10030Average.sumsq = ${TEST10030Average.sumsq}")
    println(s"ZJJX10050Average.sumsq = ${ZJJX10050Average.sumsq}")
    println(s"GXHX10050Average.sumsq = ${GXHX10050Average.sumsq}")
    println(s"GXLC50210Average.sumsq = ${GXLC50210Average.sumsq}")
    println(s"GXRA50200Average.sumsq = ${GXRA50200Average.sumsq}")
  }

  "The devsq of Sizes" should "be right value" in {
    println(s"TEST10010Average.devsq = ${TEST10010Average.devsq}")
    println(s"TEST10030Average.devsq = ${TEST10030Average.devsq}")
    println(s"ZJJX10050Average.devsq = ${ZJJX10050Average.devsq}")
    println(s"GXHX10050Average.devsq = ${GXHX10050Average.devsq}")
    println(s"GXLC50210Average.devsq = ${GXLC50210Average.devsq}")
    println(s"GXRA50200Average.devsq = ${GXRA50200Average.devsq}")
  }

}
