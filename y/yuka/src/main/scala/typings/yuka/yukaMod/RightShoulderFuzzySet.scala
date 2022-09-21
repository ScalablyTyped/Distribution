package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "RightShoulderFuzzySet")
@js.native
/**
  * Constructs a new right shoulder fuzzy set with the given values.
  *
  * @param [left=0] - Represents the left border of this fuzzy set.
  * @param [midpoint=0] - Represents the peak value of this fuzzy set.
  * @param [right=0] - Represents the right border of this fuzzy set.
  */
open class RightShoulderFuzzySet ()
  extends typings.yuka.rightShoulderFuzzySetMod.RightShoulderFuzzySet {
  def this(left: Double) = this()
  def this(left: Double, midpoint: Double) = this()
  def this(left: Unit, midpoint: Double) = this()
  def this(left: Double, midpoint: Double, right: Double) = this()
  def this(left: Double, midpoint: Unit, right: Double) = this()
  def this(left: Unit, midpoint: Double, right: Double) = this()
  def this(left: Unit, midpoint: Unit, right: Double) = this()
}
