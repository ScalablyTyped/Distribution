package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YUITestStatic extends js.Object {
  var Assert: IAssert
  var Case: TestCase
  var Runner: TestRunner
}

object YUITestStatic {
  @scala.inline
  def apply(Assert: IAssert, Case: TestCase, Runner: TestRunner): YUITestStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Assert")(Assert)
    __obj.updateDynamic("Case")(Case)
    __obj.updateDynamic("Runner")(Runner)
    __obj.asInstanceOf[YUITestStatic]
  }
}

