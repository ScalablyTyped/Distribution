package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRule extends js.Object {
  /**
    * A rule allows you to include logic in order to apply a set of attributes only to certain aspects of your chart that meet the crite
    * ria specified within each "rule": group. You can include any number of "rule": groups nested within a "rules": set. Place the desi
    * red attribute or attributes within each "rule": group to apply those attributes to the areas that fulfill the requirement. The eff
    * ect of rules depends largely on the placement of the "rules": set within your JSON code. In the above example, the styling attribu
    * tes within each rule will be applied to the scale-y guide. "%c == 2" | "%v <= 0" | "%v > 0" | ...
    */
  var rule: js.UndefOr[String] = js.undefined
}

object AnonRule {
  @scala.inline
  def apply(rule: String = null): AnonRule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRule]
  }
}

