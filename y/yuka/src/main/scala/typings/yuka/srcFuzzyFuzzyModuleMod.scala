package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcFuzzyFuzzyRuleMod.FuzzyRule
import typings.yuka.srcFuzzyFuzzyVariableMod.FuzzyVariable
import typings.yuka.yukaInts.`0`
import typings.yuka.yukaInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFuzzyFuzzyModuleMod {
  
  @JSImport("yuka/src/fuzzy/FuzzyModule", "FuzzyModule")
  @js.native
  /**
    * Constructs a new fuzzy module.
    */
  open class FuzzyModule () extends StObject {
    
    /**
      * Adds the given FLV under the given name to this fuzzy module.
      *
      * @param name - The name of the FLV.
      * @param flv - The FLV to add.
      */
    def addFLV(name: String, flv: FuzzyVariable): this.type = js.native
    
    /**
      * Adds the given fuzzy rule to this fuzzy module.
      *
      * @param rule - The fuzzy rule to add.
      */
    def addRule(rule: FuzzyRule): this.type = js.native
    
    /**
      * Given a fuzzy variable and a defuzzification method this returns a crisp value.
      *
      * @param name - The name of the FLV
      * @param [type=FuzzyModule.DEFUZ_TYPE.MAXAV] - The type of defuzzification (defaults to {@link FuzzyModule.DEFUZ_TYPE.MAXAV}).
      * @return The defuzzified, crips value.
      */
    def defuzzify(name: String): Double = js.native
    def defuzzify(name: String, `type`: DefuzType): Double = js.native
    
    /**
      * A map of FLVs.
      */
    val flvs: Map[String, FuzzyVariable] = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      */
    def fromJSON(json: StringDictionary[Any]): this.type = js.native
    
    /**
      * Calls the fuzzify method of the defined FLV with the given value.
      *
      * @param name - The name of the FLV
      * @param value - The crips value to fuzzify.
      */
    def fuzzify(name: String, value: Double): this.type = js.native
    
    /**
      * Remove the FLV under the given name from this fuzzy module.
      *
      * @param name - The name of the FLV to remove.
      */
    def removeFLV(name: String): this.type = js.native
    
    /**
      * Removes the given fuzzy rule from this fuzzy module.
      *
      * @param rule - The fuzzy rule to remove.
      */
    def removeRule(rule: FuzzyRule): this.type = js.native
    
    /**
      * An array of the fuzzy rules.
      */
    val rules: js.Array[FuzzyRule] = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  /* static members */
  object FuzzyModule {
    
    @JSImport("yuka/src/fuzzy/FuzzyModule", "FuzzyModule.DEFUZ_TYPE")
    @js.native
    val DEFUZ_TYPE: DefuzTypes = js.native
  }
  
  type DefuzType = Double
  
  trait DefuzTypes extends StObject {
    
    val CENTROID: `1`
    
    val MAXAV: `0`
  }
  object DefuzTypes {
    
    inline def apply(): DefuzTypes = {
      val __obj = js.Dynamic.literal(CENTROID = 1, MAXAV = 0)
      __obj.asInstanceOf[DefuzTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefuzTypes] (val x: Self) extends AnyVal {
      
      inline def setCENTROID(value: `1`): Self = StObject.set(x, "CENTROID", value.asInstanceOf[js.Any])
      
      inline def setMAXAV(value: `0`): Self = StObject.set(x, "MAXAV", value.asInstanceOf[js.Any])
    }
  }
}
