package typings.yup.anon

import typings.yup.mod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Is extends js.Object {
  var is: WhenOptionsBuilderObjectIs
  var otherwise: js.Any
  var `then`: js.Any
}

object Is {
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any, is: WhenOptionsBuilderObjectIs = null): Is = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Is]
  }
}

