package typings.yuka

import typings.yuka.fuzzyCompositeTermMod.FuzzyCompositeTerm
import typings.yuka.fuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyANDMod {
  
  @JSImport("yuka/src/fuzzy/operators/FuzzyAND", "FuzzyAND")
  @js.native
  open class FuzzyAND protected () extends FuzzyCompositeTerm {
    /**
      * Constructs a new fuzzy AND operator with the given values.
      * The constructor accepts and arbitrary amount of fuzzy terms.
      */
    def this(terms: FuzzyTerm*) = this()
  }
}
