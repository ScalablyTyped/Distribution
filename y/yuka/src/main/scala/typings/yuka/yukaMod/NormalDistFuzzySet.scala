package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "NormalDistFuzzySet")
@js.native
/**
  * Constructs a new triangular fuzzy set with the given values.
  *
  * @param [left=0] - Represents the left border of this fuzzy set.
  * @param [midpoint=0] - Mean or expectation of the normal distribution.
  * @param [right=0] - Represents the right border of this fuzzy set.
  * @param [standardDeviation=0] - Standard deviation of the normal distribution.
  */
open class NormalDistFuzzySet ()
  extends typings.yuka.normalDistFuzzySetMod.NormalDistFuzzySet {
  def this(left: Double) = this()
  def this(left: Double, midpoint: Double) = this()
  def this(left: Unit, midpoint: Double) = this()
  def this(left: Double, midpoint: Double, right: Double) = this()
  def this(left: Double, midpoint: Unit, right: Double) = this()
  def this(left: Unit, midpoint: Double, right: Double) = this()
  def this(left: Unit, midpoint: Unit, right: Double) = this()
  def this(left: Double, midpoint: Double, right: Double, standardDeviation: Double) = this()
  def this(left: Double, midpoint: Double, right: Unit, standardDeviation: Double) = this()
  def this(left: Double, midpoint: Unit, right: Double, standardDeviation: Double) = this()
  def this(left: Double, midpoint: Unit, right: Unit, standardDeviation: Double) = this()
  def this(left: Unit, midpoint: Double, right: Double, standardDeviation: Double) = this()
  def this(left: Unit, midpoint: Double, right: Unit, standardDeviation: Double) = this()
  def this(left: Unit, midpoint: Unit, right: Double, standardDeviation: Double) = this()
  def this(left: Unit, midpoint: Unit, right: Unit, standardDeviation: Double) = this()
}
