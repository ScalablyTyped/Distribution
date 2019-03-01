package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartClientDeployment extends js.Object {
  var simple: js.UndefOr[java.lang.String] = js.undefined
  var weak: js.UndefOr[java.lang.String] = js.undefined
}

object SmartClientDeployment {
  @scala.inline
  def apply(simple: java.lang.String = null, weak: java.lang.String = null): SmartClientDeployment = {
    val __obj = js.Dynamic.literal()
    if (simple != null) __obj.updateDynamic("simple")(simple)
    if (weak != null) __obj.updateDynamic("weak")(weak)
    __obj.asInstanceOf[SmartClientDeployment]
  }
}

