package typings.yui.YUITest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YUITestStatic extends js.Object {
  
  var Assert: IAssert = js.native
  
  var Case: TestCase = js.native
  
  var Runner: TestRunner = js.native
}
object YUITestStatic {
  
  @scala.inline
  def apply(Assert: IAssert, Case: TestCase, Runner: TestRunner): YUITestStatic = {
    val __obj = js.Dynamic.literal(Assert = Assert.asInstanceOf[js.Any], Case = Case.asInstanceOf[js.Any], Runner = Runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[YUITestStatic]
  }
  
  @scala.inline
  implicit class YUITestStaticOps[Self <: YUITestStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssert(value: IAssert): Self = this.set("Assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCase(value: TestCase): Self = this.set("Case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner(value: TestRunner): Self = this.set("Runner", value.asInstanceOf[js.Any])
  }
}
