package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  /**
    * A rule allows you to include logic in order to apply a set of attributes only to certain aspects of your chart that meet the crite
    * ria specified within each "rule": group. You can include any number of "rule": groups nested within a "rules": set. Place the desi
    * red attribute or attributes within each "rule": group to apply those attributes to the areas that fulfill the requirement. The eff
    * ect of rules depends largely on the placement of the "rules": set within your JSON code. In the above example, the styling attribu
    * tes within each rule will be applied to the scale-y guide. "%c == 2" | "%v <= 0" | "%v > 0" | ...
    */
  var rule: js.UndefOr[String] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
