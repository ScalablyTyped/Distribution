package typings.yuka.yukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "FuzzyRule")
@js.native
/**
  * Constructs a new fuzzy rule with the given values.
  *
  * @param [antecedent] - Represents the condition of the rule.
  * @param [consequence] - Describes the consequence if the condition is satisfied.
  */
open class FuzzyRule ()
  extends typings.yuka.fuzzyRuleMod.FuzzyRule {
  def this(antecedent: typings.yuka.fuzzyTermMod.FuzzyTerm) = this()
  def this(antecedent: Null, consequence: typings.yuka.fuzzyTermMod.FuzzyTerm) = this()
  def this(antecedent: Unit, consequence: typings.yuka.fuzzyTermMod.FuzzyTerm) = this()
  def this(antecedent: typings.yuka.fuzzyTermMod.FuzzyTerm, consequence: typings.yuka.fuzzyTermMod.FuzzyTerm) = this()
}
