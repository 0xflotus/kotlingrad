package edu.umontreal.kotlingrad.numerical

import edu.umontreal.kotlingrad.functions.ScalarConst
import edu.umontreal.kotlingrad.functions.ScalarFun

abstract class RealNumber<X: ScalarFun<X>, Y>(open val value: Y): ScalarConst<X>(), Comparable<Y> by value
  where Y: Number, Y: Comparable<Y> {
  override fun equals(other: Any?) =
    if (other is RealNumber<*, *>) value == other.value else super.equals(other)

  override fun hashCode() = value.hashCode()
}