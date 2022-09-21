package typings.yuka

import typings.yuka.fuzzyCompositeTermMod.FuzzyCompositeTerm
import typings.yuka.fuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyFAIRLYMod {
  
  @JSImport("yuka/src/fuzzy/operators/FuzzyFAIRLY", "FuzzyFAIRLY")
  @js.native
  /**
    * Constructs a new fuzzy FAIRLY hedge with the given values.
    *
    * @param [fuzzyTerm=null] - The fuzzy term this hedge is working on.
    */
  open class FuzzyFAIRLY () extends FuzzyCompositeTerm {
    def this(fuzzyTerm: FuzzyTerm) = this()
  }
}
