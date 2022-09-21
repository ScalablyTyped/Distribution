package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.yuka.fuzzySetMod.FuzzySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyVariableMod {
  
  @JSImport("yuka/src/fuzzy/FuzzyVariable", "FuzzyVariable")
  @js.native
  /**
    * Constructs a new fuzzy linguistic variable.
    */
  open class FuzzyVariable () extends StObject {
    
    /**
      * Adds the given fuzzy set to this FLV.
      *
      * @param fuzzySet - The fuzzy set to add.
      */
    def add(fuzzySet: FuzzySet): this.type = js.native
    
    /**
      * Defuzzifies the FLV using the "Centroid" method.
      *
      * @param [samples=10] - The amount of samples used for defuzzification.
      * @return The defuzzified, crips value.
      */
    def defuzzifyCentroid(): Double = js.native
    def defuzzifyCentroid(samples: Double): Double = js.native
    
    /**
      * Defuzzifies the FLV using the "Average of Maxima" (MaxAv) method.
      *
      * @return The defuzzified, crips value.
      */
    def defuzzifyMaxAv(): Double = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Fuzzifies a value by calculating its degree of membership in each of this variable's fuzzy sets.
      *
      * @param value - The crips value to fuzzify.
      */
    def fuzzify(value: Double): this.type = js.native
    
    /**
      * An array of the fuzzy sets that comprise this FLV.
      */
    val fuzzySets: js.Array[FuzzySet] = js.native
    
    /**
      * The maximum value range of this FLV.
      * This value is automatically updated when adding/removing fuzzy sets.
      * @default -Infinity
      */
    val maxRange: Double = js.native
    
    /**
      * The minimum value range of this FLV.
      * This value is automatically updated when adding/removing fuzzy sets.
      * @default Infinity
      */
    val minRange: Double = js.native
    
    /**
      * Removes the given fuzzy set from this FLV.
      *
      * @param fuzzySet - The fuzzy set to remove.
      */
    def remove(fuzzySet: FuzzySet): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
