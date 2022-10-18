package typings.yuka

import typings.yuka.srcFuzzyFuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFuzzyFuzzySetMod {
  
  @JSImport("yuka/src/fuzzy/FuzzySet", "FuzzySet")
  @js.native
  /**
    * Constructs a new fuzzy set with the given values.
    *
    * @param [representativeValue] - The maximum of the set's membership function.
    */
  open class FuzzySet () extends FuzzyTerm {
    def this(representativeValue: Double) = this()
    
    /**
      * Computes the degree of membership for the given value. Notice that this method
      * does not set {@link FuzzySet#degreeOfMembership} since other classes use it in
      * order to calculate intermediate degree of membership values. This method be
      * implemented by all concrete fuzzy set classes.
      *
      * @param value - The value used to calculate the degree of membership.
      * @return The degree of membership.
      */
    def computeDegreeOfMembership(value: Double): Double = js.native
    
    /**
      * Represents the degree of membership to this fuzzy set.
      * @default 0
      */
    var degreeOfMembership: Double = js.native
    
    /**
      * Represents the left border of this fuzzy set.
      * @default 0
      */
    var left: Double = js.native
    
    /**
      * The maximum of the set's membership function. For instance, if
      * the set is triangular then this will be the peak point of the triangular.
      * If the set has a plateau then this value will be the mid point of the
      * plateau. Used to avoid runtime calculations.
      * @default 0
      */
    var representativeValue: Double = js.native
    
    /**
      * Represents the right border of this fuzzy set.
      * @default 0
      */
    var right: Double = js.native
    
    /**
      * Unique ID, primarily used in context of serialization/deserialization.
      */
    def uuid: String = js.native
  }
}
