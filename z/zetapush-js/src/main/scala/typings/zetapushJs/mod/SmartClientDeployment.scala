package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartClientDeployment extends js.Object {
  var simple: js.UndefOr[String] = js.undefined
  var weak: js.UndefOr[String] = js.undefined
}

object SmartClientDeployment {
  @scala.inline
  def apply(simple: String = null, weak: String = null): SmartClientDeployment = {
    val __obj = js.Dynamic.literal()
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (weak != null) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartClientDeployment]
  }
}

