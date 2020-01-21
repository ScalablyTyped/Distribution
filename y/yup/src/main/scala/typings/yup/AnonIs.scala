package typings.yup

import typings.yup.mod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIs extends js.Object {
  var is: WhenOptionsBuilderObjectIs
  var otherwise: js.Any
  var `then`: js.Any
}

object AnonIs {
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any, is: WhenOptionsBuilderObjectIs = null): AnonIs = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIs]
  }
}

