package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.fuzzySetMod.FuzzySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalDistFuzzySetMod {
  
  @JSImport("yuka/src/fuzzy/sets/NormalDistFuzzySet", "NormalDistFuzzySet")
  @js.native
  /**
    * Constructs a new triangular fuzzy set with the given values.
    *
    * @param [left=0] - Represents the left border of this fuzzy set.
    * @param [midpoint=0] - Mean or expectation of the normal distribution.
    * @param [right=0] - Represents the right border of this fuzzy set.
    * @param [standardDeviation=0] - Standard deviation of the normal distribution.
    */
  open class NormalDistFuzzySet () extends FuzzySet {
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
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Represents the peak value of this fuzzy set.
      * @default 0
      */
    var midpoint: Double = js.native
    
    /**
      * Represents the standard deviation of this fuzzy set.
      * @default 0
      */
    var standardDeviation: Double = js.native
  }
}
