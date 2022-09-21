package typings.yuka

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyTermMod {
  
  @JSImport("yuka/src/fuzzy/FuzzyTerm", "FuzzyTerm")
  @js.native
  open class FuzzyTerm () extends StObject {
    
    /**
      * Clears the degree of membership value.
      */
    def clearDegreeOfMembership(): this.type = js.native
    
    /**
      * Returns the degree of membership.
      *
      * @return Degree of membership.
      */
    def getDegreeOfMembership(): Double = js.native
    
    /**
      * Transforms this instance into a JSON object.
      *
      * @return The JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Updates the degree of membership by the given value. This method is used when
      * the term is part of a fuzzy rule's consequent.
      *
      * @param value - The value used to update the degree of membership.
      */
    def updateDegreeOfMembership(value: Double): this.type = js.native
  }
}
