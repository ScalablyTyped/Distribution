package typings.yui.YUITest

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
    val __obj = js.Dynamic.literal(Assert = Assert.asInstanceOf[js.Any], Case = Case.asInstanceOf[js.Any], Runner = Runner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[YUITestStatic]
  }
}

