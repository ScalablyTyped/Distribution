package typings.yuka

import typings.yuka.srcFuzzyFuzzyCompositeTermMod.FuzzyCompositeTerm
import typings.yuka.srcFuzzyFuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFuzzyOperatorsFuzzyVERYMod {
  
  @JSImport("yuka/src/fuzzy/operators/FuzzyVERY", "FuzzyVERY")
  @js.native
  /**
    * Constructs a new fuzzy VERY hedge with the given values.
    *
    * @param [fuzzyTerm=null] - The fuzzy term this hedge is working on.
    */
  open class FuzzyVERY () extends FuzzyCompositeTerm {
    def this(fuzzyTerm: FuzzyTerm) = this()
  }
}
