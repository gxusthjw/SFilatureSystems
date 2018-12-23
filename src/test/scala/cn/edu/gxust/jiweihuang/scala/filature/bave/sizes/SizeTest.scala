package cn.edu.gxust.jiweihuang.scala.filature.bave.sizes

import cn.edu.gxust.jiweihuang.scala.test.UnitSpec

class SizeTest extends UnitSpec {

  "Dtex" should "be a singleton object" in {
    println(s"Dtex = ${Dtex}")
    println(s"Dtex.length = ${Dtex.length}")
    println(s"Dtex.weight = ${Dtex.weight}")
  }

  "Tex" should "be a singleton object" in {
    println(s"Tex = ${Tex}")
    println(s"Tex.length = ${Tex.length}")
    println(s"Tex.weight = ${Tex.weight}")
  }

  "Denier" should "be a singleton object" in {
    println(s"Denier = ${Denier}")
    println(s"Denier.length = ${Denier.length}")
    println(s"Denier.weight = ${Denier.weight}")
  }

  "Size" should "be a final class" in {
    val size = Size(1)
    val size2 = Size(1, Tex)
    val size3 = Size(1, Denier)
    println(s"${size} = ${Size.toDenier(size)}")
    println(s"${size} = ${Size.toDtex(size)}")
    println(s"${size} = ${Size.toTex(size)}")

    println(s"${size2} = ${Size.toDenier(size2)}")
    println(s"${size2} = ${Size.toDtex(size2)}")
    println(s"${size2} = ${Size.toTex(size2)}")

    println(s"${size3} = ${Size.toDenier(size3)}")
    println(s"${size3} = ${Size.toDtex(size3)}")
    println(s"${size3} = ${Size.toTex(size3)}")
  }
}
