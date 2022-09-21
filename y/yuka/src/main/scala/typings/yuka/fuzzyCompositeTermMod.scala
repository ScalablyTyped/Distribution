package typings.yuka

import typings.yuka.fuzzyTermMod.FuzzyTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyCompositeTermMod {
  
  @JSImport("yuka/src/fuzzy/FuzzyCompositeTerm", "FuzzyCompositeTerm")
  @js.native
  /**
    * Constructs a new fuzzy composite term with the given values.
    *
    * @param [terms=[]] - An arbitrary amount of fuzzy terms.
    */
  open class FuzzyCompositeTerm () extends FuzzyTerm {
    def this(terms: js.Array[FuzzyTerm]) = this()
    
    /**
      * List of fuzzy terms.
      */
    var terms: js.Array[FuzzyTerm] = js.native
  }
}
