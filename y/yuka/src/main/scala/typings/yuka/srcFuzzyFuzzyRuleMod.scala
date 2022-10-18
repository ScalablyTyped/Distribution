package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yuka.srcFuzzyFuzzySetMod.FuzzySet
import typings.yuka.srcFuzzyFuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFuzzyFuzzyRuleMod {
  
  @JSImport("yuka/src/fuzzy/FuzzyRule", "FuzzyRule")
  @js.native
  /**
    * Constructs a new fuzzy rule with the given values.
    *
    * @param [antecedent] - Represents the condition of the rule.
    * @param [consequence] - Describes the consequence if the condition is satisfied.
    */
  open class FuzzyRule () extends StObject {
    def this(antecedent: FuzzyTerm) = this()
    def this(antecedent: Null, consequence: FuzzyTerm) = this()
    def this(antecedent: Unit, consequence: FuzzyTerm) = this()
    def this(antecedent: FuzzyTerm, consequence: FuzzyTerm) = this()
    
    /**
      * Represents the condition of the rule.
      * @default null
      */
    var antecedent: FuzzyTerm | Null = js.native
    
    /**
      * Describes the consequence if the condition is satisfied.
      * @default null
      */
    var consequence: FuzzyTerm | Null = js.native
    
    /**
      * Evaluates the rule and updates the degree of membership of the consequent term with
      * the degree of membership of the antecedent term.
      */
    def evaluate(): this.type = js.native
    
    /**
      * Restores this instance from the given JSON object.
      *
      * @param json - The JSON object.
      * @param fuzzySets - Maps fuzzy sets to UUIDs.
      */
    def fromJSON(json: StringDictionary[Any], fuzzySets: Map[String, FuzzySet]): this.type = js.native
    
    /**
      * Initializes the consequent term of this fuzzy rule.
      */
    def initConsequence(): this.type = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
}
